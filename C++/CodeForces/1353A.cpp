#include<iostream>
using namespace std;

void solution(int n){
	int num = n;
	int count = 1;
	while(n>9){
		if((n%10)!=0){
			count++;
		}
		n/=10;
	}
	cout<<count<<endl;
	int divider = 1;
	while(num>9){
		if(num%10!=0){
			cout<<(num%10)*divider<<" ";
		}
		num/=10;
		divider*=10;
	}
	cout<<num*divider<<endl;
	
}

int main()
{
	int t;
	cin>>t;
	while(t--){
		int n;
		cin>>n;
		solution(n);
	}
}

