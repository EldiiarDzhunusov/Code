#include<iostream>
#include<string.h>
using namespace std;
int big1;
int medium1;
int small1;
ParkingSystem(int small, int medium, int big) {
    big1=big;
    medium1 = medium;
    small1 = small;

}

bool addCar(int carType) {
    if(carType == 1){
        if(small1>0){
            small1--;
        }
        else{
            return false;
        }
    }
    else if(carType == 2){
        if(medium1>0){
            medium1--;
        }
        else{
            return false;
        }

    }
    else if(carType == 3){
        if(big1>0){
            big1--;
        }
        else{
            return false;
        }
    }
    return true;
}


int main()
{
	string s = "(1+(2*3)+((8)/4))+1";
	cout<<solution(s)<<endl;
}

