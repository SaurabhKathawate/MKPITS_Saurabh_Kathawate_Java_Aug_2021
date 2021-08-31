//4- Write a C program to find whether a given year is a leap year or not.
#include<stdio.h>
int main()
{
	int year;
	printf("Enter Year ");
	scanf("%d",&year);
	if(year % 400 == 0)
	{
		printf("\n This is a leap year");
	}
    else if(year % 100 == 0)
    {
    	printf("\n This is a not leap year");
	}
	else if(year % 4 == 0)
	{
		printf("\n This is a leap year");
	}
	else
	{
		printf("\n This is a not leap year");
	}
}

