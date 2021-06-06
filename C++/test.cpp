#include <bits/stdc++.h>
#include <stdio.h>
#include <string>
using namespace std;


int main() {
	map<int, vector<int> > m;
	vector<int> v;
	v.push_back(3);
	v.push_back(2);
	for(auto x: v){
		cout<<x<<" ";
	}
	cout<<endl;
	m.insert(pair<int, vector<int> > (10, v));
	v.push_back(4);
	for(auto x: v){
		cout<<x<<" ";
	}
	cout<<endl;
	m.insert(pair<int, vector<int> > (3, v));
	v.push_back(3);
	for(auto x: v){
		cout<<x<<" ";
	}
	cout<<endl;
	v = m[10];
	v[0] = 10;
	for(auto x: v){
		cout<<x<<" ";
	}
	cout<<endl;
	for(auto x: m){
		cout<<"MAP: ";
		cout<<x.first<<" ";
		for(auto k: x.second){
		cout<<k<<" ";
		}
		cout<<endl;
	}
		
	
	cout<<endl;
	
}



