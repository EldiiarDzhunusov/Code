//1
left = [1, 2, 3, 4, 7]
right = [5, 6]


zigzag = Zigzag(left, right)

asssert zigzag.next() == 1
asssert zigzag.next() == 5
asssert zigzag.next() == 2
assert zigzag.hasNext()
asssert zigzag.next() == 6
asssert zigzag.next() == 3
asssert zigzag.next() == 4
asssert zigzag.next() == 7
assert not zigzag.hasNext()

/*class
 Zigzag:
    def __init__(self):
        pass
        
    def hasNext(self):
        pass
        
    def next(self):
        pass
    */
        
public class Zigzag{
    private int[] left;  //left.length
    private int[] right;  //right.length
    private int = index1 = 0;   
    private int = index2 = 0;  
    private boolean isLeft = true;  /
    public Zigzag(int[] left, int[] right){
        this.left = left;
        this.right = right;
    }
    public boolean hashNext(){
        if(index1==left.length && index2 ==right.length){
            return false;
        }
        return true;
    }
    public int next(){
        if(!hasNext){
            throw Error;
        }
        else if(index1 ==left.length){
            return right[index2++];
        }
        else if(isLeft){
            if(index2<right.length){
                 isLeft= false;
            }
            return left[index1++];
            
        }
        else if(!isLeft){
            if(index1<left.length){
                isLeft=true;
            }
            return right[index2++];
            
        }
    }
    
}












//2

string = "AAABBCAA"  // A..Z

// "A3B2CA2"
// char not in A..Z -> Error
// "" -> ""

// def compress(string: str) -> str:
    //pass
    
    
asciiCodeA = int('A')
    
public String compress( String str){
    String ans = "";
    if(str.length==0){
        return ans;
    }
    char ch = str.charAt(0);
    int count =1;
    for(int i=1 ; i<str.length(); i++){'
        if(!((int)str.charAt(i) >= 65 && (int)str.charAt(i)<=90)){
            throw Error;
        }
        if(str.charAt(i)==ch){
            count++;
        }
        else{
            if(count==1){
                ans+=Character.toString(ch);
                ch = str.charAt(i);
            }
            else{
                ans+=Character.toString(ch);
                ans+=count;
                count=1;
                ch = str.charAt(i);
            }
        }
    }
    
    if(count==1){
        ans+=Character.toString(ch);
    }
    else{
        ans+=Character.toString(ch);
        ans+=count;
    }
    
    return ans;
    
    
    
    
}

//3

// [1, 2, 3, 4, 8, 15, 17, 18, 29]  // sorted, unique
shifted = [17, 18, 29, 1, 2, 3, 4, 8, 15]   // sorted, unique, shifted
O(n)
O(n)
int num = shifted[n/2];
int num2 = shifted[(0+index(num))/2];

O(2logN)

// findMax(shifted) == 29
// findMax([]) == Error
int findMax(int[] shifted) {
    
}
