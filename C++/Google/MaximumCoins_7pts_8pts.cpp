#include <iostream>
using namespace std;

int main(){
	int t;
	cin>>t;
    int caseNumber = 1;
    while (t--) {
        int size;
        cin>>size;
        long long int arr[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cin>>arr[i][j];
            }
        }
        long long int ans = 0;
	    for (int i = 0; i < size; i++) {
	        int down = 0;
	        int right = i;
	        long long int localMax = 0;
	        while(right<size){
	            localMax += arr[down][right];
	            right++;
	            down++;
	        }
	        if(localMax>ans){
	            ans = localMax;
	        }
	    }
	    for (int i = 0; i < size; i++) {
	        long long int localMax = 0;
	        int down = i;
	        int right = 0;
	        while(down<size && right<size){
	            localMax += arr[down][right];
	            right++;
	            down++;
	        }
	        
	        if(localMax>ans){
	            ans = localMax;
	        }
	    }
        printf("Case #%d: %d\n", caseNumber, ans);
        caseNumber++;
    }
}



