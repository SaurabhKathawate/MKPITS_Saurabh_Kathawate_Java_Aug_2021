//11-Write a C program to read temperature in centigrade and display a suitable message
#include<stdio.h>
int main()
{
	int temp;
	printf("Enter Temperature ");
	scanf("%d",&temp);
	if(temp<=0)
	{
		printf("\n Freezing weather");
	}
	else if(temp>0 && temp<=10)
	{
		printf("\n Very Cold weather");
	}
	else if(temp>=11 && temp<=20)
	{
		printf("\n Cold weather");
	}
	else if(temp>=21 && temp<=30)
	{
		printf("\n Normal in Temp");
	}
	else if(temp>=31 && temp<=40)
	{
		printf("\n Its Hot");
	}
	else if(temp>40)
	{
		printf("\n Very Hot");
	}
}

