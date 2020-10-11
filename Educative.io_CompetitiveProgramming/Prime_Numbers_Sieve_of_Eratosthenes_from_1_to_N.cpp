#include <iostream>
#include <bits/stdc++.h>
#define lli long long int
using namespace std;

int main(){
    int n; 
    cin>>n;
    vector<bool> is_prime(n+1,true);
    
    for (int i=2;i*i<=n;i++){
        if(is_prime[i]){
            for(int j=i+i; j<= n; j+=i){
                is_prime[j]=false;
            }}}



    for(int i=2;i<=n;i++){
        if(is_prime[i]){
            cout<<i<<" ";
        }
    }
    cout << endl;
    
}
// for(int i=0; i<  ;i++)
// for(int j=0; j<  ;j++)

//Finding all prime numbers from 2 to N numbers
//Input 
// 30
// Output
// 2 3 5 7 11 13 17 19 23 29 
// O(N∗log(logN)) Complexity