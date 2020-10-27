#include <stdio.h>
#include <string.h>
int main()
{
	printf("hello, enter a password: ");
	char password[100];
	scanf("%s",password);
	int size = strlen(password);
	printf("The size of your password is %d",size);
}
