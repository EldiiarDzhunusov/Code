#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

 

int letter_fill(char, char[], char[]);
void init_unknown(char[], char[]);

int main()
{
    int a[] = {10, 4, 2, 10, 21, 13, 15, 9};

	int b[] = {9, 2, 28, 92, 55, 78, 24, 42};
	
	int *x, *y, *z;
	
	x = &a[4];
	
	y = &b[3];
	
	z = &a[7];
	
	printf("%d\n", *(x-2));
	printf("%d\n", *(z-4));
	printf("%d\n", (*y-*x));
	if( x < z){
		printf("true\n");
	}
	else{
		printf("false\n");
	}
	if( *x > *y ){
		printf("true\n");
	}
	else{
		printf("false\n");
	}


}
