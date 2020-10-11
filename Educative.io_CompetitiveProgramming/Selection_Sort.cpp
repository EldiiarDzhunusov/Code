#include <iostream>
#include <bits/stdc++.h>
#define lli long long int
using namespace std;
//Selection Sorting of an array
int main(){
    int n=6; //Enter the size of your array
    int arr[n]={6,5,4,3,2,1}; //Enter your array

    for(int i=0;i<n;i++){
        int min_index=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min_index]){
                min_index=j;
            }
        }
        swap(arr[i],arr[min_index]);
    }
    for (int i = 0;i < n; i++) cout << arr[i] << " "; cout << "\n";
    return 0;
}