//A-function with no parameter and returning nothing (void)
//3-wap to create a function square to accept a no. and display the square of that no.
//creating a function square
#include<stdio.h>
void square()
{
	int n1,square;
	printf("enter  no.");
	scanf("%d",&n1);
	square=n1*n1;
	printf("\n square of a  no.  =%d",square);
}

int main() 
{
    //calling the function
    square();
    printf("\n bye from main function");
}

