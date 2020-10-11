// Given an array, A[]A[] of length NN. Rotate it clockwise by dd or cyclic shift the element to the right by dd. Input format

// The first line consists of two space-separated integers N,dN,d (1 \leq N \leq 10^5)(1≤N≤10
// ​5
// ​​ ).

// The second line consists of NN space-separated integers representing the array A[]A[] (1 \leq A[i] \leq 10^5)(1≤A[i]≤10
// ​5
// ​​ ).

// Sample #
// Input:

// 8 3
// 1 2 3 4 5 6 7 8
// Output

// 6 7 8 1 2 3 4 5


#include <iostream>
#include <vector>

using namespace std;

int main() {


  int N, d;
  cin >> N >> d;
  vector<int> v(N);
  for (int i = 0; i < N; i++)
    cin >> v[i];

  vector<int> res(8);
  
  for (int i = N - d, j = 0; i < N; i++, j++) res[j] = v[i];
  for (int i = 0, j = d; i < N - d; i++, j++) res[j] = v[i];

  for (int i = 0; i < N; i++) 
    cout << res[i] << " "; 

  return 0;
}