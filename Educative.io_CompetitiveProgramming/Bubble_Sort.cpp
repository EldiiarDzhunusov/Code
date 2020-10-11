#include <iostream>
#include <bits/stdc++.h>
#define lli long long int
using namespace std;

int main(){
    int n=6;
    int arr[n]={6,5,4,3,2,1};

    for(int i=0;i<n;i++){
        for(int j=1;j<n-i;j++){
            if(arr[j]<arr[j-1]){
                swap(arr[j],arr[j-1]);
            }
        }
    }
    for(int i=0;i<n;i++) cout <<arr[i]<<" ";cout <<endl;
}

