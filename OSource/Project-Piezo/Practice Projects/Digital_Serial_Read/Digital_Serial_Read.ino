void setup()
{
  Serial.begin(9600);
  pinMode(2,INPUT);
}
void loop()
{
  int i=digitalRead(2);
  Serial.println(i);
  delay(500);
}
