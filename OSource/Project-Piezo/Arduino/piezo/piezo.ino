/*
Author : Rohan Mundhey
Date : 30 / 9 / 2014
Description : Arduino Board receives input from the Pressure Sensor ,Receives current Position from the GPRS module and send's the current location to Registered SIM cards via GSM module
The SIM card's Numbers are Registered via an Android App using a Bluetooth Module Interfaced with Arduino .

Arduino Board : Arduino UNO


Microcontroller:	        ATmega328
Operating Voltage:	        5V
Input Voltage (recommended):	7-12V
Input Voltage (limit):	        6-20V
Digital I/O Pins:	        14
PWM Digital I/O Pins:	        6
Analog Input Pins:	        6
DC Current per I/O Pin:	        40 mA
DC Current for 3.3V Pin:        50 mA
Flash Memory:	                32 KB
Flash Memory for Bootloader:	0.5 KB
SRAM:	                        2 KB
EEPROM:	                        1 KB
Clock Speed:	                16 MHz
Lenght:	                        68.6 mm
Width:	                        53.4 mm
Weight:	                        25 g

*/

#define LED 13  //Pin for LED
#define BUTTON 2 //Piin for Button (Switch)

int val=0; // Storing State of Switch
void setup()
{
  
pinMode(LED,OUTPUT); //Making LED Pin as a OUTPUT 
pinMode(BUTTON,INPUT); //Making Button Pin as a INPUT

}
void loop()
{
  
val=digitalRead(BUTTON); //Read Input Value & Store It

// Check wether INPUT is High , ie Button is Pressed & Turn LED on
if((val==HIGH))
{

  digitalWrite(LED,HIGH); 
 
} 

}
