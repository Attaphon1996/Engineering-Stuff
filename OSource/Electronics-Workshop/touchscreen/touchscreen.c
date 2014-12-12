#include<avr/io.h>
#include<tecxtra.h>
#include<util/delay.h>
#include<touch.h>
main()
{
lcd_init();
DDRD=0b11111111;
PORTD=0b00000000;
init_adc();
int x,y;
_delay_ms(10);
while(1)
{
x=xcd();
y=ycd();


if((x>550) && (x<900))
{
PORTD=0b11110000;
}
if((x>150) && (x<500))
{
PORTD=0b00000000;
}



} // While Closed

}
