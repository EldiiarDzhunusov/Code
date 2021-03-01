#include <stdio.h>  
void hello(int x);

int main(){
	int i;
	int a;
	for(i = 1; i<6 ;i++){
		hello(i);
	}
	
}

void hello(int x){
	printf("hello world %d\n",x);
	
}






