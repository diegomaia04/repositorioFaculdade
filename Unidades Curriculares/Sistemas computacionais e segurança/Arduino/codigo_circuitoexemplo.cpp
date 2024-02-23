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
