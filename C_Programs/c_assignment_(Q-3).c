//3-Write a c program to check whether a given number is a perfect number or not.
//Input the number : 56
//Expected Output :
//The positive divisor : 1 2 4 7 8 14 28
//The sum of the divisor is : 64
//So, the number is not perfect.
#include<stdio.h>
int main()
{
    int num,i=1,sum=0;
    printf("Enter a number: ");
    scanf("%d",&num);
    while(i<num)
	{
        if(num%i==0)
        sum=sum+i;
        i++;
    }
    if(sum==num)
    {
    	printf("%d is a perfect number",i);
	}
    else
	{
		printf("%d is not a perfect number",i);
	}
}
