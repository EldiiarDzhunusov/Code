#include <stdio.h>

int isprime(int n){
	int i;
	for(i=2; i<n; i++){
		if(n%i==0){
			return 0;
		}
	}
	return 1;
}

int prime(int n){
	int ans=3;
	int counter = 1;
	while(counter!=n){
		ans++;
		if(isprime(ans)==1){
			counter++;
		}
	}
	return ans;
}

int main() {
	int answer = prime(7);
	printf("%d",answer);
}

