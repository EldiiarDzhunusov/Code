// OneEditApart("cat", "dog") -> false 
// OneEditApart("cat", "cats") -> true
//OneEditApart("", "") -> true

//ta //aat     changes++;
//
// "" "f"
public boolean OneEditApart(String s1, String s2){

   int size1 = s1.length();
   int size2 = s2.length();
   int index1= 0;
   int index2 = 0;
   int changes = 0;
   if(Math.abs(size1-size2)>1){
       return false;
   }
   while(index1< size1 && index2< size2){
       if(s1.charAt(index1)== s2.charAt(index2){
           index1++;
           index2++;
       }
       else{
           if(size1>size2) {
               index1++;
               changes++;
           }
           else if(size2>size1){
               index2++;
               changes++;
           }
           else{
               index1++;
               index2++;
               changes++;
           }
       }
   }
   if(Math.abs(index1-index2)>0){
       changes++;
       if(changes>1){
           return false;
       }
       else{
           return true;
       }
    }
    if(changes>1){
        return false;
    }
    return true;
    
}


/////

struct Node {
    int value;
    Node* l;
    Node* r;
};

class Handler {
public:
    Handler(Node*);
    int sum(size_t level);
};
O(log n)                

                10
        12              3
4             3     4           2

            

      10
  
   10
      2 
10 
   -3
      4
         -6
         
sum(1) = 10
sum(2) = 10 + 10 + (-3) = 17
sum(3) = 10 + 10 + (-3) + 10 + 2 + 4 = 31
sum(4) = 10 + 10 + (-3) + 10 + 2 + 4 + (-6) = 25
