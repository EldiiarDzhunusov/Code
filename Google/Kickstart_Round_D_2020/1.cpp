#include <iostream>
#include <bits/stdc++.h>
#define lli long long int
using namespace std;

int main(){
    lli t,case1=0;
    cin>> t;
    while(t--){
    lli n,max=-1,total=0;
    cin>>n;
    lli arr[n];
    for (int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n;i++){
        if (arr[i]>max){
            max=arr[i];
            if(i==n-1){
                total+=1;
            }
            else if(arr[i]>arr[i+1]){
                total+=1;
            }
            else{
                continue;
            }
        }
    }
    case1+=1;
    cout <<"Case #"<<case1<<": "<<total<<endl;
    }

}


// for(int i=0; i<  ;i++)
// for(int j=0; j<  ;j++)
