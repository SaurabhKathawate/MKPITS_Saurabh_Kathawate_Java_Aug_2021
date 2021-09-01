//B-function with parameters and returning nothing (void)
//9-wap to create function result with 3 int parameters to accept 3 subject marks calculate and display total, percentage and grade.
#include<stdio.h>
void result(int s1,int s2,int s3)
{
	int result,total;
	float percentage;
	total=s1+s2+s3;
	printf("\nTotal Marks=%d",total);
	percentage=(total/300.0f)*100.0f;
	printf("\nPercentage=%.2f",percentage);
	if(percentage>=75)
	{
	printf("\nGrade=Distinction");
	}
	else if(percentage>=60 && percentage<75)
	{
    printf("\nGrade=First Class");
	}
	else 
	{
	printf("\nGrade=Pass Class");	
	}
}

int main()
{
	int s1,s2,s3,total;
	float percentage;
	printf("\nEnter Marks of 3 Subjects: ");
	scanf("%d%d%d",&s1,&s2,&s3);
	//
	result(s1,s2,s3);
	printf("\nbye from main function");
}

