#include <stdio.h>

int main(){

	int cents;
	printf("Enter number: ");
	scanf("%d",&cents);
	int counter = 0;
	if(cents/50>=1){
		counter+=(cents/50);
		cents -=50*(cents/50);
		printf("%d 50\n",counter);
		
	}
	if(cents/10>=1){
		counter+=(cents/10);
		cents -=10*(cents/10);
		printf("%d 10\n",counter);
	
	}
	if(cents/5>=1){
		counter+=(cents/5);
		cents -=5*(cents/5);
		printf("%d 5\n",counter);
	
	}
	if(cents/3>=1){
		counter+=(cents/3);
		cents -=3*(cents/3);
		printf("%d 3\n",counter);

	}
	printf("%d \n",counter);
	printf("%d \n",cents);
	counter+=cents;
	printf("Minimum number of coins needed: %d",counter);
	
	
}
