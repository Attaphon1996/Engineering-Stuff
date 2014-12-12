#include<tecxtra.h>
#include<avr/io.h>
#include<util/delay.h>
int count=0;
main()
{
int x,y;
lcd_init();
lcd_clrscr();
init_adc();
_delay_ms(10);
while(1)
{
x=read_adc(0);
y=read_adc(1);

if(x>300)
{
count++;
lcd_goto(0,1);
lcd_printc('N');
lcd_goto(1,1);
lcd_printc('=');
lcd_printi(count);


}

if(y<600)
{
count--;
lcd_goto(0,1);
lcd_printc('N');
lcd_goto(1,1);
lcd_printc('=');
lcd_printi(count);




}


}
}
