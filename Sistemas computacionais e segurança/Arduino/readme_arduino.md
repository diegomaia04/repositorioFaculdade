# Projeto de extensão na área de Robótica

### Aula do dia 23/10/2023


Ideia Principal: Construir um robo que se mova de forma sozinha que percorra em um labirinto

Arduino e sua programação!

Descobrir a sua funcionalidade do Arduino e como funiconna na vida real

- serão dois enconctros onlines e três na universidade

- Logíca de programação com robos e reforcando o conhecimento de robotica e de arduino

Pense no Arduino como o hardware dee um computador
- Placa mae, processador, HD e memoria

- Os pinos do arduino serão digitais, Normalmente se utiliza a usb conectada ao computador

- Todos os pinos do arduino são de envios ou receber sinais, porque ele é acionado por sinal eletrico de 5V

- Os pinos são de entrada e saída digital
  * GND = bit 0


- exemplo de acender um LED arduino

 ``` 
  // C++ code
void setup()
{
  pinMode(A0, OUTPUT);
}

void loop()
{
  digitalWrite(A0, HIGH);
  delay(500); // Wait for 500 millisecond(s)
  digitalWrite(A0, LOW);
  delay(500); // Wait for 500 millisecond(s)
}
 ```
- exemplo de codigo de acender um led com sensor de distancia
```
// C++ code
//
int distancia = 0;

long readUltrasonicDistance(int triggerPin, int echoPin)
{
  pinMode(triggerPin, OUTPUT);  // Clear the trigger
  digitalWrite(triggerPin, LOW);
  delayMicroseconds(2);
  // Sets the trigger pin to HIGH state for 10 microseconds
  digitalWrite(triggerPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(triggerPin, LOW);
  pinMode(echoPin, INPUT);
  // Reads the echo pin, and returns the sound wave travel time in microseconds
  return pulseIn(echoPin, HIGH);
}

void setup()
{
  pinMode(A0, OUTPUT);
}

void loop()
{
  distancia = 0.01723 * readUltrasonicDistance(12, 11);
  if (distancia < 100) {
    digitalWrite(A0, HIGH);
  } else {
    digitalWrite(A0, LOW);
  }
  delay(100); // Wait for 100 millisecond(s)
} 


```

- Exemplo de como acender um led com uso de potenciometro
```
// C++ code
//
int potencia = 0;

void setup()
{
  pinMode(A1, INPUT);
  Serial.begin(9600);
  pinMode(3, OUTPUT);
}

void loop()
{
  potencia = analogRead(A1);
  potencia = (potencia / 4);
  Serial.println(potencia);
  analogWrite(3, potencia);
  delay(100); // Wait for 100 millisecond(s)
}
}
```

### aula do dia 30/10/2023

- Explicaçaõ de bibliotecas no arduino
- continuação da aula passada com programação do arduino

- Software Arduino IDE comentado na aulaserve para qualuqer aplicação

- Já o hardware depende da aplicação que voce ira seguir.

- Baixar a versão de desenvolvimento do arduino = Arduino.Ide

- No proprio site do arduino tem toda a docuemntação sobre varias placas e aplicações sobre o arduino

- Na IDE já existem codigos prontos depdenndo da aplicação. Vimos como no exemplo na aula, caso não aja, só é preciso baixar a biblioteca

- Explicação de compoentntes de entrdaa e saida de componetes do arduino utilizando o tinkercard

- Arduino desevolvido no tinkercard com Motor e bateria de 9 volts com conversis de cinco volts, ver diagrama e docuemntação

