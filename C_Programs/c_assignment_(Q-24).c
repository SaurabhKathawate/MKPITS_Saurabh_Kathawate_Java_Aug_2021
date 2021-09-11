//24-create a function to print table of a number.
#include<stdio.h>
void table(num)
{
	int i,result;
	for(i=1;i<=10;i++)
	{
		result=num*i;
		printf("\n%d * %d = %d",num,i,result);
	}
}
int main()
{
	int num;
	printf("Enter number: ");
	scanf("%d",&num);
	table(num);
}
