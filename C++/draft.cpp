
#include<iostream>
using namespace std;
int main()
{
	int ans = 0;
	int array[100][150];
	for (int column=0; column <100; column++){
		for (int row=0; row <150; row++){
			cin>>array[column][row];
			if (array[column][row]<ans){
				ans= array[column][row];
			}
		}
	}
	cout<<ans<<endl;		
}

