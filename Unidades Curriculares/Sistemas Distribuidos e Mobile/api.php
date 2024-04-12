<?php
function funcaoApi(string $url){
	$ch = curl_init($url);
	curl_setopt($ch,CURLOPT_CUSTOMREQUEST, 'GET');
	curl_setopt($ch,CURLOPT_RETURNTRANSFER,true);
	$response = curl_exec($ch);
	$statusCode = curl_getinfo($ch,CURLINFO_HTTP_CODE);
	curl_close($ch);
	if($statusCode==200){
		return $response;
	}else{
		echo "<br> ==> API FALHOU!";
		echo "<br> ERRO ===>".$statusCode;
		return false;
	}
}

$retornoApi = funcaoApi("https://swapi.dev/api/people/5/");
if($retornoApi){
	echo "ABAIXO OS DADOS DE RETORNO DA API: <br>";
	$objeto = json_decode($retornoApi);
	echo "<br>Nome: ".$objeto->name;
	echo "<br>Altura: ".$objeto->height;
	echo "<br>Peso: ".$objeto->mass;
	echo "<br>Cor Cabelo: ".$objeto->hair_color;
	echo "<br>Cor da pele: ".$objeto->skin_color;
	echo "<br>Cor dos olhos: ".$objeto->eye_color;
	echo "<br>Gênero: ".$objeto->gender;	
}

?>
