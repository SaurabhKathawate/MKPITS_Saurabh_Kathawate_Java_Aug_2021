//B-function with parameters and returning nothing (void)
//repeat the above program with accepting the no. from the user.
//5-wap to create a function square with one int parameter to accept a number and calculate and display the square of that no.
#include<stdio.h>
void square(int n1)
{
    int square;
	square=n1 * n1;
	printf("\n square of a  no.  =%d",square);
}

int main() 
{
    //calling the function square and passing number to function parameter
    int n1;
    printf("\n enter number");
    scanf("%d",&n1);
    square(n1);
    printf("\n bye from main function");
}

