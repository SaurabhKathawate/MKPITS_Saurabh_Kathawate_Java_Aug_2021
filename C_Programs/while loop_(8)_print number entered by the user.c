//8-wap to accept a number and print from 1 to the number entered by the user
#include<stdio.h>
int main()
{
	int num;
	int i=1;
	printf("\nEnter no: ");
	scanf("%d",&num);
	while(i<=num)
	{
		printf("\nNum=%d",i);
		i=i+1;
	}
}
