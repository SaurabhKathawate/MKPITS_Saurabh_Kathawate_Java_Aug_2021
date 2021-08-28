//7-wap to accept a no. and print the table of that no
#include<stdio.h>
int main()
{
	int num,result;
	int i=1;
	printf("\nEnter no: ");
	scanf("%d",&num);
	while(i<=10)
	{
		result=num*i;
		printf("\n%d * %d = %d",num,i,result);
		i++;
	}
}
