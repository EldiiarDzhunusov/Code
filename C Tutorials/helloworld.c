#include <stdio.h>

int main(){
	//input
	int number;
	scanf("%d",&number);
	int steps = 0;
	//logic
	if(number/5 > 0){
		steps += (number/5);
		number -= (5*(number/5));
	}
	if(number/4 > 0){
		steps += number/4;
		number = number - (4*(number/4));
		
	}
	if(number/3 > 0){
		steps += number/3;
		number = number - (3*(number/3));
		
	}
	if(number/2 > 0){
		steps += number/2;
		number = number - (2*(number/2));
	}
	if(number/1 > 0){
		steps += number/1;
		number = number - (1*(number/1));
	}

	printf("%d\n",steps);
}
