#include <stdio.h>
int main()
{
     int num=2;
     
     
     switch(num)
     {
         case 1:
           printf("Case1: Value is: %d", num);
           
         case 2:
           printf("Case2: Value is: %d", num);
           
         case 3:
           printf("Case3: Value is: %d", num);
          
         default:
           printf("Default: Value is: %d", num);
           
    }
    return 0;
}
