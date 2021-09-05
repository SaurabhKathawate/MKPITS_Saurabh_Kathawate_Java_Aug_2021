//6-Write a C program to find the largest of three numbers.
#include<stdio.h>
int main()
{
	int n1,n2,n3;
	printf("Enter 3 Numbers ");
	scanf("%d%d%d",&n1,&n2,&n3);
	if(n1>n2 && n1>n3)
	{
		printf("n1 is largest");
	}
	else if(n2>n3)
	{
		printf("n2 is largest");
	}
	else
	{
		printf("n3 is largest");
	}
}

