#include <bits/stdc++.h>

using namespace std;
int fib(int n) {
      vector<int> v1;
	  v1.push_back(0);
	  v1.push_back(1);
	  int k = 1 ;
	  while(n>k){
	  	v1.push_back(v1[k]+v1[k-1]);
	  	k++;
	  } 
	  
	  return v1[n];
    }
int main(){
	int k;
	cin>>k;
	cout<<fib(k)<<endl;
}
