#include <stdio.h>

extern x = 10;
void funct(){
	printf("Extern x: %d\n",x);
}
void main()
{
	int x = 15;
	funct();
	printf("Local x: %d\n",x);
	
}

