#include<iostream>
using namespace std;
void solution(string word);
int main()
{
	int t;
	cin>>t;
	while(t--){
		string word;
		cin>>word;
		solution(word);
	}
}
void solution(string word){
	int maxAns = 1;
	for (int i=0;i<word.length();i++){
		int localMax= 0;
		int left = 0;
		int right = i;
		while(word[left]==word[right] && left<=right){
			if(left == right){
				localMax++;
			}
			else{
				localMax+=2;
			}
			left++;
			right--;
		}
		if((left-1)==(right+1)){
			maxAns = max(maxAns,localMax);
		}
		if(left==right+1){
			maxAns = max(maxAns,localMax);
		}
		
		
	}
	cout<<maxAns<<endl;
	
}

