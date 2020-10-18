#include<iostream>
using namespace std;
void solution(int m, int n){
	int left = 0;
	for (int i=0; i<m; i++){
		if(i%2==0){
			for (int j=0; j<n; j++){
				cout<<"#";
			}
			cout<<endl;
		}
		else{
			if(left==1){
				cout<<"#";
				for (int j=0; j<n-1; j++){
					cout<<".";
				}
				cout<<endl;
				left=0;
			}
			else{
				
				for (int j=0; j<n-1; j++){
					cout<<".";
				}
				cout<<"#";
				cout<<endl;
				left = 1;
			}
			
		}
	}
	
	
}


int main()
{
	int t=1;
	while(t--){
		int m, n;
		cin >>m>>n;
		solution(m,n);	
	}
}


