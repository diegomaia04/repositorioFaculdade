<?php
// Definindo o cabeçalho para trabalhar com JSON
header("Content-type: application/json;charset=utf-8");

// Sobrescrevendo o $_POST com os dados JSON recebidos
$_POST = json_decode(file_get_contents('php://input'), true);

function criarPersonagem($nome, $classe, $nivel = 1)
{
    // Conectando com o banco de dados
    $host = 'localhost';
    $port = '3306';
    $database = 'microservico';
    $username = 'root';
    $password = ''; // Coloque sua senha aqui
    $conn = new mysqli($host, $username, $password, $database, $port);

    // Verificando se houve erro na conexão
    if ($conn->connect_error) {
        die('Erro ao conectar ao banco de dados: ' . $conn->connect_error);
    }

    // Montando a query SQL para inserir um novo personagem
    $stmt = $conn->prepare("INSERT INTO personagens (nome, nivel, classe) VALUES (?, ?, ?)");
    $stmt->bind_param("sis", $nome, $nivel, $classe);

    // Executando a query SQL
    $stmt->execute();

    // Verificando se ocorreu algum erro na execução da query
    if ($stmt->error) {
        die("Erro ao inserir o personagem: " . $stmt->error);
    }

    // Obtendo o ID do último registro criado
    $id = $stmt->insert_id;

    // Fechando a conexão com o banco de dados
    $stmt->close();
    $conn->close();

    // Retornando os dados do personagem criado em formato JSON
    return [
        'id' => $id,
        'nome' => $nome,
        'nivel' => $nivel,
        'classe' => $classe
    ];
}

// Verificando se a requisição é do tipo POST
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    // Obtendo os dados do corpo da requisição
    $nome = $_POST['nome'] ?? '';
    $classe = $_POST['classe'] ?? '';

    // Criando um novo personagem
    $personagemCriado = criarPersonagem($nome, $classe);

    // Retornando os dados do personagem criado em formato JSON
    echo json_encode($personagemCriado);
}

