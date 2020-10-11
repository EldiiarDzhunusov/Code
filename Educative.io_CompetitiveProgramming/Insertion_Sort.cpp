#include <iostream>
#include <bits/stdc++.h>
#define lli long long int
using namespace std;

int main(){
    int n= 6;
    int arr[n]={5,6,4,3,2,1};

    for (int i=0; i<n; i++){
        int j=i;
        while(j>=1 && arr[j]<arr[j-1]){
            swap(arr[j],arr[j-1]);
            j--;
        }
    }
    for (int i=0;i<n;i++) cout<<arr[i]<< " "; 
    cout << endl;
}

