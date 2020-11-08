#include <stdio.h>

int main(){
	//input
	
	double amount;
	printf("Enter amount: ");
	scanf("%lf",&amount);
	//solution
	double tax = amount * 0.06;
	double tip = amount * 0.18;
	double answer = amount + tax + tip;
	printf("The grand price is $%0.2lf\n\n",answer);
	
	
	
	
}
