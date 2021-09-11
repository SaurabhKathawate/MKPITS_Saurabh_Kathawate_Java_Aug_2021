//6-wap to accept 3 subject marks and print total,per and grade.
#include<stdio.h>
int main()
{
	int s1,s2,s3,total;
	float per;
	printf("Enter marks of 3 subjects: ");
	scanf("%d%d%d",&s1,&s2,&s3);
	total=s1+s2+s3;
	per=(float) (total/3.0f);
	printf("\nTotal Marks=%d",total);
	printf("\nPercentage=%.2f",per);
	if(per>=75)
	{
		printf("\nGrade=Distinction");
	}
	else if(per>=60 && per<75)
	{
		printf("\nGrade=First Class");
	}
	else if(per>=45 && per<60)
	{
		printf("\nGrade=Second Class");
	}
	else if(per>=35 && per<45)
	{
		printf("\nGrade=Third Class");
	}
	else
	{
		printf("\nGrade=Fail");
	}
}
