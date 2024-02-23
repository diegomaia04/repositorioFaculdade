// C++ code
//

bool b1 = false;
bool b2 = false;

int contb1 = 0;
int contb2 = 0;


void setup(){
  pinMode(13, OUTPUT);
  pinMode(A0, INPUT);
  pinMode(A1, INPUT); 
   
  TCCR1A = 0; 
  TCCR1B = (1 << WGM12) | (1 << CS11) | (1 << CS10);  
  OCR1A = 249; 
  TIMSK1 = (1 << OCIE1A); 
  sei(); 
  
}while ((contb1 > 0) && (contb2 == 0 )) {
      digitalWrite(13, HIGH);
      delay(1000);
      digitalWrite(13, LOW);
      delay(1000);
      contb1--;
    }

  
    while (contb2 > 0) {
      digitalWrite(13, HIGH);
      delay(500);
      digitalWrite(13, LOW);
      delay(500);
      contb2--;
  	}
  	
}

ISR(TIMER1_COMPA_vect) {
  if (!digitalRead(A0)) {
    //digitalWrite(13, HIGH);
    b1 = true;
    contb1 = 5;
  } 
  if (!digitalRead(A1)) {
    //digitalWrite(13, LOW);
    b2 = true;
    contb2 = 5;
  }
  
}
