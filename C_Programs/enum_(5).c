//5-The enum names available in an enum type can have the same value. Let's look at the example.
#include <stdio.h>  
int main(void) 
{  
    enum fruits{mango = 1, strawberry=0, apple=1};  
    printf("The value of mango is %d", mango);  
    printf("\nThe value of apple is %d", apple);  
    return 0;  
}  

