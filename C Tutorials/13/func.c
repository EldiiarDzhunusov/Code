#include <stdio.h>

void customName(int number){
	number = number*1000;
	number = number+5;
	printf("%d\n",number);
}


int main () {
	int numbers[1000];
	int i;
	for( i=0;i<1000;i++){
		numbers[i]=100;
	}
	for(i=0;i<1000;i++){
		customName(numbers[i]);
	}
}
	
