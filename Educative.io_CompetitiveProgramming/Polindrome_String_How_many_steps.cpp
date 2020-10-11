#include <iostream>
#include <bits/stdc++.h>
#define lli long long int
using namespace std;

int main(){
    string s; cin>>s;
    int n= s.size();
    int step=0;
    for(int i=0, j=n-1;i<j;i++,j--){
        if(s[i]!=s[j]){
            step++ ;
        }
    }
    cout <<step<<endl;
}

//how many letters should be changed to make it polyndrome
//Reads the same in both ways

// Input

// madam
// Output

// 0
// Input

// radecar
// Output

// 1