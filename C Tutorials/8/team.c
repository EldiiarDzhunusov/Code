#include <stdio.h>

int main(){
	int numberOfQ;
	scanf("%d",&numberOfQ);
	int completed = 0;
	
	int i;
	while(numberOfQ--){
		int person1;
		int person2;
		int person3;
		scanf("%d",&person1);
		scanf("%d",&person2);
		scanf("%d",&person3);
		int counter = 0 ;
		if(person1 == 1){
			counter++;
		}
		if(person2 == 1){
			counter++;
		}
		if(person3 == 1){
			counter++;
		}
		if(counter>=2 ){
			completed= completed + 1;
		}
	}
	printf("%d\n",completed);
}
