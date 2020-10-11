#include <iostream>
#include <bits/stdc++.h>
#define lli long long int
using namespace std;

string remove_zero(string s){
    bool zero=true;
    string new_num;
    for(char c : s){
        if(c!='0'){
            zero=false;
        }
        if(zero!=true){
            new_num+=c;
        }
    }
    return new_num;
}
char compare(string a, string b){
    a=remove_zero(a);
    b=remove_zero(b);
    
    if(a.size()!=b.size()){
        return a.size() >b.size() ? 'A': 'B';
    }
    if(a.size()==b.size()){
        for(int i=0;i<a.size();i++){
            if (a[i]!=b[i]){
                return a[i]>b[i] ? 'A': 'B';
            }
            
        }
    }
    return '=';
}


int main(){
    string a,b;
    cin>>a>>b;
    cout <<compare(a,b)<<endl;
}


// leading zero's get reduced
// We use string because int cannot handle really large numbers
// A - if A > BA>B
// B - if B > AB>A
// = - If numbers are equal