#include <stdio.h>
#include <string.h>

int main () {
	//input
	int numberOfBottles;
	printf("Enter a number of bottles: ");
	scanf("%d", &numberOfBottles);
	double sum = 0.0;
	
	while(numberOfBottles>0){
   		double litres;
   		printf("Enter the size: ");
   		scanf("%lf",&litres);
   		//solution
   		if(litres<=1.0){
   			sum = sum + 0.10;
		}
		else{
			sum+= 0.25;
		}
   		numberOfBottles-=1;
   	}
   	printf("The price you are reciving is: $%0.2f\n",sum);
}
