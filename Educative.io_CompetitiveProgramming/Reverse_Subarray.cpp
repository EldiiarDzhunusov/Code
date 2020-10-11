// Problem statement #
// Given an array AA of NN integers. Answer QQ queries of the type (l, r)(l,r) - reverse the subarray A[l...r]A[l...r]. Print the array after each query.

// Input format The first line contains two integers NN and QQ (1 \leq N, Q \leq 10^3)(1≤N,Q≤10
// ​3
// ​​ ).

// The second line contains NN space-separated integers representing the array A[]A[] (1 \leq A[i] \leq 10^6)(1≤A[i]≤10
// ​6
// ​​ ).

// Next, QQ lines each contains pair of integers ll and rr (1 \leq l \leq r \leq N)(1≤l≤r≤N).

// Input

// 5 3
// 1 2 3 4 5
// 1 5
// 2 3
// 3 5
// Output

// 5 4 3 2 1
// 5 3 4 2 1
// 5 3 1 2 4



#include <iostream>
#include <vector>

using namespace std;

int main() {
 

  int N, Q;
  cin >> N >> Q;
  vector<int> A(N, 0);
  for (int i = 0; i < N; i ++)
    cin >> A[i];
    
  
    for(int i = 0; i < Q; i++) {
      int l, r;
      cin >> l >> r;
      l --; r --; // covert to 0-based index

      for(int p1 = l, p2 = r; p1 < p2; p1++, p2--){
        swap(A[p1], A[p2]);
      }
      for (int i = 0; i < N; i++) cout << A[i] << " "; cout << "\n";
    
  }

  

  return 0;
}
