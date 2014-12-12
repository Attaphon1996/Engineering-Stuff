void setup()
{
 Serial.begin(9600);
 pinMode(2,OUTPUT);
 
}
void loop()
{int i=analogRead(A0);
Serial.println(i);
delay(250);
if(i>600)
{
 digitalWrite(2,HIGH); 
}
else
digitalWrite(2,LOW);
  
}
