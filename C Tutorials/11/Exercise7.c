#include <stdio.h>

int main(){
	int number;
	printf("Enter a number: ");
	scanf("%d",&number);
	int answer = 0;
	
	int i;
	for (i = 1; i< number; i++){
		answer += i;
	}
	
	printf("The sum of all numbers betwen 1 and %d is %d\n",number,answer);
}
