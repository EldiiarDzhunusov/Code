#include <iostream>
#include <bits/stdc++.h>
#define lli long long int
using namespace std;

int main(){
    int n, q;
    cin>> n>>q;
    vector<int> a(n);
    for(int i=0; i < n;i++){
        cin>>a[i];
    
    }
    
    vector<int> sum(n);
    sum[0]=a[0];
    for(int i=1;i<n;i++){
        sum[i]=sum[i-1]+a[i];
       
    }
    for (int i=0;i<q;i++){
        int l,r;
        cin>>l>>r;
        l--;r--;
        int ans=sum[r];
        if (l>0){
            ans=ans-sum[l-1];
        }
        cout<<ans<<" ";
    }

}



// Given an array, AA, of NN integers, answer QQ queries of the type (l, r)(l,r) - sum of the elements in the subarray A[l...r]A[l...r]. Print the sum for each query.

// Input format

// The first line contains two space-separated integers NN and QQ (1 \leq N,Q \leq 10^6)(1≤N,Q≤10
// ​6
// ​​ ).

// The second line contains NN integers representing the array A[]A[] (1 \leq A[i] \leq 10^6)(1≤A[i]≤10
// ​6
// ​​ ).

// The next QQ lines each contain a pair of integers ll and rr.

// Output format

// Print QQ integers and answer to the queries.

// Sample #
// Input

// 5 3
// 1 2 4 8 16
// 1 5
// 2 3
// 3 5
// Output

// 31 6 28