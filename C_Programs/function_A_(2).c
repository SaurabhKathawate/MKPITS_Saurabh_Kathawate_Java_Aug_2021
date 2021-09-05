//A-function with no parameter and returning nothing (void)
//2-wap to create a function sum to accept 2 no. and display the addition of 2 no.
//creating a function sum
#include<stdio.h>
void sum()
{
	int n1,n2,result;
	printf("\n enter 2 no.");
	scanf("%d%d",&n1,&n2);
	result=n1+n2;
	printf("\n addtion of 2 no. =%d",result);
}

int main() 
{
    //calling the function
    sum();
    printf("\n bye from main function");
}

