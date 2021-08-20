//14-Write a C program to read temperature in centigrade and display a suitable message
#include<stdio.h>
int main()
{
	int temp;
	printf("enter value");
	scanf("%d",temp);
	if(temp<0)
	{
		printf("\n Freezing weather");
	}
	else if("temp>0 && temp<10")
	{
		printf("\n Very Cold weather");
	}
	else if("temp>10 && temp<20")
	{
		printf("\n Cold weather");
	}
	else if("temp>20 && temp<=")
	{
		printf("\n Normal in Temp");
	}
	else if("temp>30 && temp<40")
	{
		printf("\n Its Hot");
	}
	else("temp>40")
	{
		printf("\n Very Hot");
	}
}

