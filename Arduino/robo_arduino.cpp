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
  Serial.begin(9600);
  pinMode(3, OUTPUT);
  pinMode(5, OUTPUT);
}

void loop()
{
  distancia = 0.01723 * readUltrasonicDistance(7, 6);
  Serial.println(distancia);
  if (distancia > 10) {
    analogWrite(3, 0);
    analogWrite(5, 100);
  } else {
    analogWrite(3, 0);
    analogWrite(5, 0);
  }
  delay(10); // Delay a little bit to improve simulation performance
}
