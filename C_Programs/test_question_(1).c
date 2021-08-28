//1. Write a C program to accept two integers and check whether they are equal or not.
#include<stdio.h>
int main()
{
	int n1,n2;
	printf("Enter 2 Numbers ");
	scanf("%d%d",&n1,&n2);
	if(n1==n2)
	{
		printf("\n They are equal");
	}
	else
	{
		printf("\n They are not equal");
	}
}

