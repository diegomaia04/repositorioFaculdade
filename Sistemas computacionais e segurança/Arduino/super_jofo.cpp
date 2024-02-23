// C++ code
//

boolean estadoLed02 = false;

void acendeLed01(){
  digitalWrite(LED_BUILTIN, HIGH);
}

void espera() {
  delay(1000); // Wait for 1000 millisecond(s)
}

void apagaLed01(){
  digitalWrite(LED_BUILTIN, LOW);
}

bool leBotao(){
  if (digitalRead(2) == 1) {
    return true;
  } else {
    return false;
  }
}

void alteraEstadoLed02(){
  if (estadoLed02 == false){
    estadoLed02 = true;
    digitalWrite(12, HIGH);
  } else {
    estadoLed02 = false;
    digitalWrite(12, LOW);
  }
}

void blink() {
  estadoLed02 = leBotao();
  alteraEstadoLed02();
}


void setup()
{
  pinMode(LED_BUILTIN, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(2, INPUT);
  //pinMode(2, INPUT_PULLUP);
  //attachInterrupt(digitalPinToInterrupt(2), blink, CHANGE);
}
 


void loop(){
  //estadoLed02 = leBotao();
  //alteraEstadoLed02();
  
  while(leBotao()){};
  alteraEstadoLed02();
  
  acendeLed01();
  espera();
  apagaLed01();
  espera();
}

