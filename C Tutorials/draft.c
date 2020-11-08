#include <stdio.h>
#include <math.h>
int main () {
	int number;
	printf("Enter a number: ");
	scanf("%d",&number);
	int *ptrNumber = &number;
	double ans = sqrt(*ptrNumber);
	printf("The square root of a number %d is %0.2lf",*ptrNumber,ans);
}
	
