#include <stdio.h>
#include <string.h>

int main(){
	int n;
	scanf("%d",&n);
	int i;
	for(i = 0; i<n ; i++){
		char word[100];
		scanf("%s",word);
		int size = strlen(word);
		if(size>10){
			printf("%c%d%c\n",word[0],size-2,word[size-1]);
		}
		else{
			printf("%s\n",word);
		}
	}
	
	
}
