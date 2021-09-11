//5-wap to print greater of 3 no.
#include<stdio.h>
int main()
{
	int n1,n2,n3;
	printf("Enter 3 numbers: ");
	scanf("%d%d%d",&n1,&n2,&n3);
	if(n1>n2 && n1>n3)
	{
		printf("\nn1 is greater");
	}
	else if(n2>n3)
	{
		printf("\n n2 is greater");
	}
	else
	{
		printf("\n n3 is greater");
	}
}
