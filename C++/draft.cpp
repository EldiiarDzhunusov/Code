#include <bits/stdc++.h>
//
using namespace std;

// идея такова что я сперва сортирую их по имени что бы при сортировке по цифрам
// слова, по алфавиту больше шли первее при этом не теряю их порядок храня 
// индексы имен
// после если L=1 я работаю с однерками потому что у них приоритет, и после 
// с нулями
// если l=1 я вставлю все цифры на прямую, только если там не особые кейсы
// как приоритет равен нулю или -1 или больше m

void print2d(vector<vector<double>>arr,int t,vector<string> name,vector<string> nums){
//	cout<<endl;
	for (int i = 0; i < t; i++) {
//		cout<<name[((int)arr[i][0])]<<" "<<nums[((int)arr[i][0])]<<" "<<(int)arr[i][2]<<" "<<(int)arr[i][3]<<endl;
		char word[100];
		char num[100];
		strcpy(word, name[((int)arr[i][0])].c_str());
		strcpy(num, nums[((int)arr[i][0])].c_str());
		printf("%s %s %d %d\n",word,num,(int)arr[i][2],(int)arr[i][3]);
//		cout<<(arr[i][0])<<" "<<arr[i][1]<<" "<<arr[i][2]<<" "<<arr[i][3]<<endl;
	}
}
bool sortcolSecond( const vector<double>& v1,
               const vector<double>& v2 ) {
 return v1[1] < v2[1];
}
bool areSame(double a, double b)
{
    return fabs(a - b) < numeric_limits<double>::epsilon();
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int n,m,l;
	cin>>n>>m>>l;
	vector<vector<string>> names(n, vector<string>(5));
	vector<string> name(n);
	vector<string> nums(n);
	for (int i = 0; i < n; i++) {
			cin>>names[i][0];
			name[i] = names[i][0];
	        cin>>names[i][1];
	        nums[i] = names[i][1];
	        cin>>names[i][2];
	        cin>>names[i][3];
	        names[i][4] = to_string(i);
	}
	
	sort(names.begin(),names.end());
	vector<vector<double>> v(n,vector<double>(4));
	for (int i = 0; i < n; i++) {
 			v[i][0]=stod(names[i][4]);
          	v[i][1]=stod(names[i][1]);
            v[i][2]=stod(names[i][2]);
           	v[i][3]=stod(names[i][3]); 
	}
//	print2d(v,n,name);	
	sort(v.begin(), v.end(),sortcolSecond);
	
	//till here everything is good 
	//it is sorted by name and then by value
	bool taken[m+1];
	for(int i=0; i<m+1; i++){
		taken[i] = false;
	}
//	cout<<endl;
//	cout<<"before algorithm"<<endl<<endl;
//	print2d(v,n,name);	
	if(l==1){
		for (int i = 0; i < n; i++) {
			if(areSame(v[i][2],1.0)){
				if(v[i][3]==-1){
					v[i][2]=0.0;
					continue;
				}
				if(v[i][3]>m){
					v[i][3]=-1.0;
				}
				else{
					taken[(int)v[i][3]]=true;
				}
			}		
		}
		int index = 1;
		bool limitNotReached = true;
		for (int i = 0; i < n; i++) {
			if(areSame(v[i][2],0.0)){
				if(v[i][3]!=0.0){
					if(!limitNotReached){
						v[i][3] = -1;
						continue;
					}
					while(taken[index]){
						index++;
						if(index>m){
							limitNotReached = false;
							break;
						}
					}
					if(limitNotReached){
						v[i][3]=index;
						taken[index] = true;
					}
					else{
						v[i][3] =-1;
					}
				}
			}
		}
	}	
	else{
		int index = 1;
		for (int i = 0; i < n; i++) {
            if(areSame(v[i][3],-1.0)){
                v[i][2] = 0;
            }
            if(index>m){
                v[i][3] = -1;
            }
            else if(v[i][3]!=0){
                v[i][3] = index;
                index++;
            }
        }
		
	}
//	cout<<"before sort by name"<<endl<<endl;
//	print2d(v,n,name);
//	
	sort(v.begin(), v.end()); 
//	cout<<"after sort by name"<<endl<<endl;
	print2d(v,n,name,nums);
}






