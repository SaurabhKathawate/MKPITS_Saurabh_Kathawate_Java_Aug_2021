//5-Write a C program to read the age of a candidate and determine whether it is eligible for casting his/her own vote.
#include<stdio.h>
int main()
{
	int age;
	printf("Enter your age ");
	scanf("%d",&age);
	if(age>=18)
	{
		printf("\nYou are eligible to vote");
	}
	else
	{
		printf("\nYou are not eligible to vote");
	}
}

