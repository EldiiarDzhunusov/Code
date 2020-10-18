#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>
using namespace std;
int main()
{
	string str="hellohhhhello",sub="hello"; // str is string to search, sub is the substring to search for
	
	vector<size_t> positions; // holds all the positions that sub occurs within str
	
	size_t pos = str.find(sub, 0);
	while(pos != string::npos)
	{
	    positions.push_back(pos);
	    pos = str.find(sub,pos+1);
	}
	for(int i=0; i < positions.size(); i++){
		cout<<positions.at(i)<<endl;
	}
	
}

