#include <stdio.h>
#include <stdbool.h>

int main()
{
	int number;
	scanf("%d",&number);
	
	if(number%2==0){
		if(number>2){
			printf("YES");
		}
		else{
			printf("NO");
		}
	}
	else{
		printf("NO");
	}
	
}

