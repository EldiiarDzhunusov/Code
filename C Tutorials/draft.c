#include <stdio.h>
#include <math.h>
#include <string.h>
#include <ctype.h>

int main () {
	char initial[100] = "World is a good place to live!";
	printf("Initial string is \"%s\"\n",initial);
	printf("Enter a new string: ");
	char word[100];
	scanf("%[^\n]", word);
	
	strcpy(initial,word);
	printf("The word has been replaced to: \"%s\"\n",initial);
}
	
