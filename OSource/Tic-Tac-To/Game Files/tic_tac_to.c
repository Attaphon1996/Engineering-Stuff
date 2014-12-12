/*
Author :Rohan Mundhey
*/

// A tic tac toe game
#include<stdio.h>
#include<windows.h>
#include<stdlib.h>
#include<time.h>

void gotoxy(short col,short row);
void display();
void example();
void game(int n);
void check();
void logic(int n);

int  arr[3][3];
int  com[3][3];

int main()
{   
	system("cls");
	
	fflush(stdin);
		
	char ch;
    
	int n;

printf("\nWelcome to my tic tac toe game\n");

printf("\nenter your moves in number from 1 to 9\n");

printf("\nexample\n");

display();

example();

display();

printf("\n\n did you got how to play it : y/n \n\n");

scanf(" %c",&ch);

if(ch=='y')
{
	system("cls");
    printf(" \n Let the Game begin\n");

	display();
	
	while(1)
	{   static int mat[5];
	    static int i=0;
		static int s=1;
		gotoxy(10,25);
		printf(" Enter your move : ");
		scanf(" %d",&n);
		mat[i]=n;

		i++;


		switch(s)
		{
		
		case 1:

			break;

		case 2:

			if((n==mat[0]))
			{
				system("cls");
				
				printf(" you Entered wrong move Man !!!\n\nfirst go and learn how to use keyboard\n\n ");
				
				for(int y=1;y<=100;y++);
				
				exit(2);
			
			}

			break;
		case 3:

			if((n==mat[0])||(n==mat[1]))
			{
				system("cls");
				
				printf(" you Entered wrong move Man !!!\n\nfirst go and learn how to use keyboard\n\n ");
				
				for(int y=1;y<=100;y++);
				
				exit(3);
			}

			break;
		case 4:

			if((n==mat[0])||(n==mat[1])||(n==mat[2]))
			{
				system("cls");
				
				printf(" you Entered wrong move Man !!!\n\nfirst go and learn how to use keyboard\n\n ");
				
				for(int y=1;y<=100;y++);
				
				exit(4);
			}

			break;
		case 5:

			if((n==mat[0])||(n==mat[1])||(n==mat[2])||(n==mat[3]))
			{
				system("cls");
				
				printf(" you Entered wrong move Man !!!\n\nfirst go and learn how to use keyboard\n\n ");
				
				for(int y=1;y<=100;y++);
				
				exit(5);
			}

			break;
			
		}

		s++;
		
		switch(n)
		{
		case 1:

			arr[0][0]=1;

			break;
		case 2:

			arr[0][1]=2;

			break;
		case 3:

			arr[0][2]=3;

			break;
		case 4:

			arr[1][0]=4;

			break;
		case 5:

			arr[1][1]=5;

			break;
		case 6:

			arr[1][2]=6;

			break;
		case 7:

			arr[2][0]=7;

			break;
		case 8:

			arr[2][1]=8;

			break;
		case 9:

			arr[2][2]=9;

			break;

		}
	

		display();

    
		game(n);

		
		check();

	
		logic(n);
    
	
		check();

	
}
	
}

else
{
	system("cls");
	
	printf(" Go Home \n\n\n");
}

return(0);
}

void display()
{
	char ch=22;

	int x,y;
	
	for(x=10,y=10;x<=20;x++)
	{   
   
       gotoxy(x,y);
	
	printf("%c",ch);
       
       }


	for(x=10,y=13;x<=20;x++)
	{
	
	gotoxy(x,y);
	
	printf("%c",ch);
	
	}
	ch=179;
	
	for(x=14,y=7;y<=18;y++)
	{

   	gotoxy(x,y);
   	
   	printf("%c",ch);

       }
	for(x=17,y=7;y<=18;y++)
	{
  	
  	gotoxy(x,y);
  	
  	printf("%c",ch);

       }

}

void example()
{ 

gotoxy(12,9);

printf("1");

gotoxy(15,9);

printf("2");

gotoxy(18,9);

printf("3");

gotoxy(12,12);

printf("4");

gotoxy(15,12);

printf("5");

gotoxy(18,12);

printf("6");

gotoxy(12,16);

printf("7");

gotoxy(15,16);

printf("8");

gotoxy(18,16);

printf("9");

printf("\n\n\n");

}



void gotoxy(short col,short row)
{

HANDLE h=GetStdHandle(STD_OUTPUT_HANDLE);

COORD position={col,row};

SetConsoleCursorPosition (h,position);

}

void game(int n)

{
	static int collect[5];
	
	static int i=0;

	

	int x;
	
	char ch=88;
       
       collect[i]=n;
       
       i++;       

      for(x=0;x<=4;x++)
      {
      


      switch(collect[x])
	  {  case 0:
             break;

		case 1:
			
			gotoxy(12,9);
			
			printf("%c",ch);
			
			break;

		case 2:
			
			gotoxy(15,9);
			
			printf("%c",ch);
			
			break ;
		case 3:
			
			gotoxy(18,9);
			
			printf("%c",ch);
			
			break ;
		case 4:
			
			gotoxy(12,12);
			
			printf("%c",ch);
			
			break ;
		case 5:
			
			gotoxy(15,12);
			
			printf("%c",ch);
			
			break ;
		case 6:
			
			gotoxy(18,12);
			
			printf("%c",ch);
			
			break ;
		case 7:
			
			gotoxy(12,16);
			
			printf("%c",ch);
			
			break ;
		case 8:
			
			gotoxy(15,16);
			
			printf("%c",ch);
			
			break ;
		case 9:
			
			gotoxy(18,16);
			
			printf("%c",ch);
			
			break ;
		
	  }



       }





}
void logic(int n)
{
	static int random[4];
	
	static int collect[4];
	
	static int human[5];
	
	static int c=1;
	
	static int i=0;



       int x;
	char ch=79;
	
      int r;             
		   

	srand ( time(NULL) );
   
	human[i]=n;
  
	 
   switch(c)
   {
   case 1:


	   while(1)
	 {   random1:
		 r=rand() % 10;
		 random[i]=r;
	  
		 
		 if((r==0) || (r==human[0]) || (r==human[1]) || (r==human[2]) || (r==human[3]) || (r==human[4]))
          {
		  goto random1;
		 }

		 else
			 break;
   
	   }
       
	   break ;
   
   
   
   case 2:


	    while(1)
	 {   random2:
		 r=rand() % 10;
		 random[i]=r;
	  
		 
		 if((r==0) || (r==human[0]) || (r==human[1]) || (r==human[2]) || (r==human[3]) || (r==human[4])||(r==random[0]) )
          {
		  goto random2;
		 }

		 else
			 break;

     
	   }
       
	   break ;


   case 3:


	    while(1)
	 {   random3:
		 r=rand() % 10;
		 random[i]=r;
	  
		 
		 if((r==0) || (r==human[0]) || (r==human[1]) || (r==human[2]) || (r==human[3]) || (r==human[4]) ||(r==random[0]) || (r==random[1]) )
          {
		  goto random3;
		 }

		 else
			 break;
     
	   }
       
	   break ;


   case 4:


	    while(1)
	 {   random4:
		 r=rand() % 10;
		 random[i]=r;
	  
		 
		 if((r==0) || (r==human[0]) || (r==human[1]) || (r==human[2]) || (r==human[3]) || (r==human[4]) ||(r==random[0]) || (r==random[1]) || (r==random[2]) )
          {
		  goto random4;
		 }

		 else
			 break;

     
	   }
       
	   break ;
  
   
   }


  c++;


  switch(r)
		{
		case 1:
			
			com[0][0]=1;
			
			break;
		case 2:
			
			com[0][1]=2;
			
			break;
		case 3:
			
			com[0][2]=3;
			
			break;
		case 4:
			
			com[1][0]=4;
			
			break;
		case 5:
			
			com[1][1]=5;
			
			break;
		case 6:
			
			com[1][2]=6;
			
			break;
		case 7:
			
			com[2][0]=7;
			
			break;
		case 8:
			
			com[2][1]=8;
			
			break;
		case 9:
			
			com[2][2]=9;
			
			break;

		}


       i++;
              

     for(x=0;x<=3;x++)
	 {
        
		 switch(random[x])
		{
		case 1:
			
			gotoxy(12,9);
			
			printf("%c",ch);
			
			break ;

		case 2:
			
			gotoxy(15,9);
			
			printf("%c",ch);
			
			break ;
		case 3:
			
			gotoxy(18,9);
			
			printf("%c",ch);
			
			break ;
		case 4:
			
			gotoxy(12,12);
			
			printf("%c",ch);
			
			break ;
		case 5:
			
			gotoxy(15,12);
			
			printf("%c",ch);
			
			break ;
		case 6:
			
			gotoxy(18,12);
			
			printf("%c",ch);
			
			break ;
		case 7:
			
			gotoxy(12,16);
			
			printf("%c",ch);
			
			break ;
		case 8:
			
			gotoxy(15,16);
			
			printf("%c",ch);
			
			break ;
		case 9:
			
			gotoxy(18,16);
			
			printf("%c",ch);
			
			break ;
		}

	 }

}
void check()
{
	

if((arr[0][0]==1)&&(arr[0][1]==2)&&(arr[0][2]==3))
{
	
	
	system("cls");
	
	printf("\n\n you won ! \n\n" );
	
	for(int i=1;i<=100;i++);
	
	exit(1);
	
	

}

else if((arr[1][0]==4)&&(arr[1][1]==5)&&(arr[1][2]==6))
{
	
	
	system("cls");
	
	printf("\n\n you won ! \n\n" );
    
      for(int i=1;i<=100;i++);
	
	exit(1);
	


}

else if((arr[2][0]==7)&&(arr[2][1]==8)&&(arr[2][2]==9))
{
	
	
	system("cls");
	
	printf("\n\n you won ! \n\n" );

	for(int i=1;i<=100;i++);
	
	exit(1);


}

else if((arr[0][0]==1)&&(arr[1][0]==4)&&(arr[2][0]==7))
{
	
	
	system("cls");
	
	printf("\n\n you won ! \n\n" );
	
	for(int i=1;i<=100;i++);
	
	exit(1);
	

}

else if((arr[0][1]==2)&&(arr[1][1]==5)&&(arr[2][1]==8))
{
	
	
	system("cls");
	
	printf("\n\n you won ! \n\n" );
	
	for(int i=1;i<=100;i++);
	
	exit(1);

}

else if((arr[0][2]==3)&&(arr[1][2]==6)&&(arr[2][2]==9))
{
	
	
	system("cls");
	
	printf("\n\n you won ! \n\n" );
	
	for(int i=1;i<=100;i++);
	
	exit(1);


}

else if((arr[0][0]==1)&&(arr[1][1]==5)&&(arr[2][2]==9))
{
	
	
	system("cls");
	
	printf("\n\n you won ! \n\n" );

	for(int i=1;i<=100;i++);
	
	exit(1);

}

else if((arr[0][2]==3)&&(arr[1][1]==5)&&(arr[2][0]==7))
{
	
	system("cls");
	
	printf("\n\n you won ! \n\n" );
	
	for(int i=1;i<=100;i++);
	
	exit(1);

}


else if((com[0][0]==1)&&(com[0][1]==2)&&(com[0][2]==3))
{
	
	system("cls");
	
	printf("\n\n computer won ! \n\n" );
	
	for(int i=1;i<=100;i++);
	
	exit(1);

}

else if((com[1][0]==4)&&(com[1][1]==5)&&(com[1][2]==6))
{

	
	system("cls");
	
	printf("\n\n computer won ! \n\n" );
	
	for(int i=1;i<=100;i++);
	
	exit(1);

}

else if((com[2][0]==7)&&(com[2][1]==8)&&(com[2][2]==9))
{
	
	
	system("cls");
	
	printf("\n\n computer won ! \n\n" );

	for(int i=1;i<=100;i++);
	
	exit(1);

}

else if((com[0][0]==1)&&(com[1][0]==4)&&(com[2][0]==7))
{
	
	system("cls");
	
	printf("\n\n computer won! \n\n" );

	for(int i=1;i<=100;i++);
	
	exit(1);

}

else if((com[0][1]==2)&&(com[1][1]==5)&&(com[2][1]==8))
{

	system("cls");
	
	printf("\n\n computer  won! \n\n" );

	for(int i=1;i<=100;i++);
	
	exit(1);
	
}

else if((com[0][2]==3)&&(com[1][2]==6)&&(com[2][2]==9))
{

	system("cls");
	
	printf("\n\n computer  won ! \n\n" );

	for(int i=1;i<=100;i++);
	
	exit(1);
	
}

else if((com[0][0]==1)&&(com[1][1]==5)&&(com[2][2]==9))
{

	system("cls");
	
	printf("\n\n computer won ! \n\n" );

	for(int i=1;i<=100;i++);
	
	exit(1);
}

else if((com[0][2]==3)&&(com[1][1]==5)&&(com[2][0]==7))
{
	system("cls");
	
	printf("\n\n computer won ! \n\n" );
	
	for(int i=1;i<=100;i++);
	
	exit(1);
}

}
