// C++ code
//
int distancia = 0;

int botao = 0;

void setup()
{
  pinMode(8, INPUT);
  pinMode(A0, OUTPUT);
}

void loop()
{
  while (botao == 1) {
    botao = digitalRead(8);
  }
  digitalWrite(A0, HIGH);
  while (botao == 0) {
    botao = digitalRead(8);
  }
  digitalWrite(A0, LOW);
  delay(10); // Delay a little bit to improve simulation performance
}