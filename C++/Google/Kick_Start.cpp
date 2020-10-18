#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>
using namespace std;

int solution(string word){
	int ans =0;
	string str = word;
	string subKick="KICK";
	string subStart ="START";
	
	vector<size_t> positions; // holds all the positions that sub occurs within str
	size_t pos = str.find(subKick, 0);
	while(pos != string::npos)
	{
	    positions.push_back(pos);
	    pos = str.find(subKick,pos+1);
	}
	
	//second
	vector<size_t> positions2; // holds all the positions that sub occurs within str
	size_t pos2 = str.find(subStart, 0);
	while(pos2 != string::npos)
	{
	    positions2.push_back(pos2);
	    pos2 = str.find(subStart,pos2+1);
	}
	
	
	
	
	for(int i=0; i < positions.size(); i++){
		for(int j=0; i < positions2.size(); j++){
			if(positions.at(i)<positions2.at(j)){
				ans++;
			}
		}
	}
	return ans;
	
return ans;
}

int main(){
	int casen = 1;
	int t;
	cin>>t;
	while(t--){
		string word;	
		cin>>word;
		printf("Case #%d: %d\n", casen, solution(word));
		casen++;
	}
	
}

