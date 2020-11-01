#include <stdio.h>

int main(){
	//input
	int n;
	scanf("%d",&n);
	int x = 0;
	int i;
	for (i=0 ; i<n ; i++){
		char operand[3];
		scanf("%s",operand);
		if (operand[1] == '+'){
			x++;
		}
		else{
			x--;
		}
	}
	printf("%d\n",x);
	
}
