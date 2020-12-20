#include<stdio.h>



void main()
{
	int x[]= {1,2,3,4,5};
	int *Ptr = &x[0];
	
	
	
	if(*Ptr == x[0]){
		printf("3 ");
	}
	if(Ptr == &x[0]	){
		printf("2 ");
	}
	if(Ptr[0] == x[0]){
		printf("4 ");
	}
	if(Ptr == x[0]){
		printf("1 ");
	}
	
	
	

}
