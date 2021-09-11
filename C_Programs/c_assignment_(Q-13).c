//13-wap to accept a no and print table of that no.
#include<stdio.h>
int main()
{
	int num,i=1,result;
	printf("Enter number: ");
	scanf("%d",&num);
	
	for(i=1;i<=10;i++)
	{
		result=num*i;
		printf("\n%d * %d = %d",num,i,result);
	}
}
