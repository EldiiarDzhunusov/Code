#include <stdio.h>
#include <string.h>

int main (void) {
   char string[100];
   scanf("%s",string);
   char temp;

   int i, j;
   int n = strlen(string);
	//sort
   for (i = 0; i < n-1; i++) {
      for (j = i+1; j < n; j++) {
         if (string[i] > string[j]) {
            temp = string[i];
            string[i] = string[j];
            string[j] = temp;
         }
      }
   }
   //print
   int checker = 0;
   for (i=0; i< n; i++){
   		if(string[i]!='+'){
   			if(checker!=0){
   				printf("%c",'+');
			   }
   			printf("%c",string[i]);
   			checker=1;
		}
   }
  
   return 0;
}
