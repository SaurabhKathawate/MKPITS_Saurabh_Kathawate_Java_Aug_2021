//17-wap to create a function sum which return sum of two numbers
#include<stdio.h>
int sum()
{
	int n1,n2,result;
	printf("enter 2 numbers: ");
	scanf("%d%d",&n1,&n2);
	result=n1+n2;
	return result;
}
int main()
{
	int res;
	res=sum();
	printf("\nSum=%d",res);
}

