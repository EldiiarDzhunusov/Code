#include <stdio.h>

int main(){
	//input
	double balance;
	int year;
	printf("Enter a sum that you want to deposit: ");
	scanf("%lf",&balance);
	printf("Enter in how many years you want to see your balance: ");
	scanf("%d",&year);
	//solution
	int i;
	for(i = 0; i<year; i++){
		balance = balance * 1.04;
	}
	printf("Your balance after %d years is $%0.2lf\n\n",year, balance);
	
	
	
//	double year1 = balance + (balance * 0.04);
//	double year2 = year1 * 1.04;
//	double year3 = year2 * 1.04;
//	
//	printf("Your initial balance: %0.2lf\n",balance);
//	printf("Your balance after 1 year: %0.2lf\n", year1);
//	printf("Your balance after 2 year: %0.2lf\n", year2);
//	printf("Your balance after 3 year: %0.2lf\n", year3);
	
}
