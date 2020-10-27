#include <stdio.h>
#include <stdbool.h> 
int main()
{
	printf("Enter a number: ");
	int number;
	scanf("%d",&number);
	//checking for number being a prime
	bool answer = true;
	int i;
	for(i = 2 ; i< number; i++){
		if(number % i == 0){
			answer = false;
		}
	}
	//print if prime
	if(answer == true){
		printf("This is a prime number!\n");
	}
	else{
		printf("This is not a Prime!\n");
	}
	
	
}
