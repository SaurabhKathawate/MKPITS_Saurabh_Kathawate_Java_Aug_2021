//7-wap to accept a no. and print table of that no. using for loop.
#include<stdio.h>
int main()
{
	int num,table,i;
	printf("enter number");
	scanf("%d",&num);
	for(i=1;i<=10;i++)
	{
		table=num * i;
		printf("\n %d * %d = %d",num,i,table);
	}
}
