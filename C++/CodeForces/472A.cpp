#include<iostream>
using namespace std;
//not finished 
void solution(int number){
	int remainder = number%4;
	int numbers1 = (number/4)+remainder;
	int numbers2 = number/4;
	cout<<numbers2+numbers2<<" "<<numbers1+numbers2<<endl;
	
}

int main()
{
	int t;
	t=1;
	while(t--){
		int number;
		cin>>number;
		solution(number);
	}
}

