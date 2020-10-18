#include<iostream>
using namespace std;
#include<string.h> 
int solution(string s){
	int counter = 0;
	int max = 0;
        for (int i=0;i<s.length();i++){
        	if((s[i]=='(')){
        		counter++;
        		if(counter>max){
        			max = counter;
				}
        	
			}
			
			else if(s[i]==')'){
				if(counter>0){
					counter--;	
				}
		
			}
			
		}
        return max;
	
}

int main()
{
	string s = "(1+(2*3)+((8)/4))+1";
	cout<<solution(s)<<endl;
}

