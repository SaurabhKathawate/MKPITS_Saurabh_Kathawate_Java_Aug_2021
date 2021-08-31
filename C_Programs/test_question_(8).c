//8-Write a C program to read roll no, name and marks of three subjects and calculate the total, percentage and division.
#include<stdio.h>
int main()
{
	int roll,s1,s2,s3,total;
	float per;
	char name[15],div[10];
	printf("\nEnter Roll no ");
	scanf("%d",&roll);
	printf("\nEnter Name ");
	scanf("%s",&name);
	printf("\nEnter Marks of 3 Subjects ");
	scanf("%d%d%d",&s1,&s2,&s3);
	total = s1+s2+s3;
	per = (total/300.0f)*100.0f;
	printf("\n Total Marks=%d",total);
	printf("\n Percentage=%.2f",per);

	if(per>=75)
	{
		printf("\n Division= Distinction");
	}
	else if(per>=60 && per<75)
	{
		printf("\n Division= First Class");
	}
	else if(per>=40 && per<60)
	{
		printf("\n Division= Pass Class");
	}
	else 
	{
		printf("\n Division= Fail");
	}
}

