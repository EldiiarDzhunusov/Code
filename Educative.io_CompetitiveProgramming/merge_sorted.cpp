// Given two sorted arrays, A[]A[] and B[]B[], of sizes NN and MM respectively, merge them into a single array of size N+MN+M and print the array.

// Input format

// The first line consists of two space-separated integers N, MN,M (1 \leq N,M \leq10^5)(1≤N,M≤10
// ​5
// ​​ ).

// The second line consists of NN space-separated integers representing the array A[]A[] (1 \leq A[i] \leq 10^5)(1≤A[i]≤10
// ​5
// ​​ ).

// The third line consists of MM space-separated integers representing the array B[]B[] (1 \leq B[i] \leq 10^5)(1≤B[i]≤10
// ​5
// ​​ ).

// Output format

// Print a single line of output containing the N+MN+M integers representing the merged and sorted array C[]C[].

// Sample #
// Input:

// 4 4
// 2 3 4 6
// 1 5 7 8
// Output

// 1 2 3 4 5 6 7 8





#include <iostream>
#include <bits/stdc++.h>
using namespace std;

void merge(int a[],int b[], int c[], int n,int m){
    int j=0,i=0,k=0;
    while (i<n && j<m){
        if (a[i]<b[j]){
            c[k]=a[i];
            k++;i++;
            
        }
        else{
            c[k++]=b[j++];
            
        }
        
    }
    while (i < n)  
        c[k++] = a[i++];
    while (j < m)  
        c[k++] = b[j++];

}




int main() {
    int n,m;
    cin>> n>> m;
    int a[n],b[m],c[n+m];
    for (int i=0;i<n;i++) cin >>a[i];
    for (int i=0;i<m;i++) cin >>b[i];
    merge(a,b,c,n,m);

    for (int i = 0; i < n + m; i++)
    cout << c[i] <<" ";

  return 0;
    

}