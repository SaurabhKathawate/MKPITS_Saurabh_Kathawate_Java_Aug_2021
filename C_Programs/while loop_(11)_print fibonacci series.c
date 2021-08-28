//11-wap to accept a no and then print fibonacci series using while loop
#include<stdio.h> 
int main()
{
    int n,f,f1=-1,f2=1; 
    printf("Enter Number Of Terms: ");
    scanf("%d",&n);
    printf("The Fibonacci Series is: ");
     
    while(n>0)
    {
        f=f1+f2;
        f1=f2;
        f2=f;
        printf("\n%d",f);
        n--;
    }
}

