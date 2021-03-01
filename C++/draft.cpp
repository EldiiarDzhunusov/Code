#include<bits/stdc++.h>
using namespace std;



int main()
{
	int n,q;
	cin>>n>>q;
	int arr[n];
	int zero = 0;
	int one = 0;
	for(int i =0; i<n;i++) {
		cin>>arr[i];
		if(arr[i]==0) {
			zero++;
		}
		else {
			one++;
		}
	}
	for(int i= 0; i<q ; i++) {
			
			//started sol
			int t,k;
			cin>>t>>k;
			if(t==1) {
				arr[k-1] = 1- arr[k-1];
				if(arr[k-1]==0) {
					one--;
					zero++;
				}
				else {
					one++;
					zero--;
				}
			}
			else {
				//when t ==2
				
				if(one>=k) {
					cout<<1<<endl;
				}
				else {
					cout<<0<<endl;
				}
			}
			
		}
	
		
}
