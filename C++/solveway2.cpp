#include <bits/stdc++.h>

using namespace std;
void print2d(vector<vector<int>> v,int n){
	for(int i=0; i<n;i++){
		cout<<v[i][0]<<" "<<v[i][1]<<endl;
	}
}
void print1d(vector<int> v, int n){
	cout<<"Vector: ";
	for(int i=0; i<n;i++){
		cout<<v[i]<<" ";
	}
	cout<<endl;
}
void printMap(map<int,vector<int>> m){
	cout<<"WHOLE MAP : "<<endl;
	for(auto x: m){
		cout<<" MAP key: ";
		cout<<x.first<<" values: ";
		for(auto k: x.second){
		cout<<k<<" ";
		}
		cout<<endl;
	}
	
}

bool compareVector(vector<int> v1, vector<int> v2){
	return equal(v1.begin(), v1.end(), v2.begin());
}


int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int n,t;
	cin>>n>>t;
	vector<string> commands(t);
	vector<vector<int>> numbers(t,vector<int>(3));
	string strSet("set"); 
	string strGet("get");
	string srtRevert("revert");
	for(int i =0; i<t; i++){
		cin>>commands[i];
		cin>>numbers[i][0];
		if(strSet.compare(commands[i])==0){
			cin>>numbers[i][1];
		}
	}
	//inputs are fine
//	print2d(numbers,t);
	vector<int> currentArr(n); //assuming that numbers are 0
	set<int> revertSet;
	map<int,vector<int>> revertMap;
	for(int i=0; i<t; i++){
		if(commands[i].compare("revert")==0){
			revertSet.insert(numbers[i][0]);
		}
	}
	//settled map and set
	//the idea is that I do not want to put the same arr into my map, 
	//if ind 7 and 4 are the same the will have ind 4
	
	int lastMapIndex = 0;
	revertMap.insert(pair<int, vector<int>> (lastMapIndex, currentArr));
	vector<int> trueIndexes(t);
	for(int i =0; i<t; i++){
		if(revertSet.count(i)==1){
			if(compareVector(currentArr,revertMap[lastMapIndex])){
				trueIndexes[i] = lastMapIndex;
			}else{
				lastMapIndex = i;
				trueIndexes[i]=i;
				revertMap.insert(pair<int, vector<int> > (lastMapIndex, currentArr));
			}
		}
		if(strSet.compare(commands[i])==0){
			currentArr[numbers[i][0]]=numbers[i][1];
		}
		else if(strGet.compare(commands[i])==0){
			cout<<currentArr[numbers[i][0]]<<endl;
//			printMap(revertMap);
		}else{
			currentArr=revertMap[trueIndexes[numbers[i][0]]];
//			cout<<"after revert"<<endl;
//			printMap(revertMap);
//			print1d(currentArr,n);
			
		}
	}
	
}






