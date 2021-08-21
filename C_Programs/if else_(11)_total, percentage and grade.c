//11-wap to accept 5 subject marks then calclate total, per and grade.
#include<stdio.h>
int main()
{
	int s1,s2,s3,s4,s5,total;
	float percentage;
	char grade;
	printf("\n Enter marks of 5 Subjects ");
	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
	total=s1+s2+s3+s4+s5;
	percentage=(total/500.0f)*100.0f;
	printf("\n Percentage=%.2f",percentage);
	if(percentage>=75)
	{
		printf("\n Grade=Distinction");
	}
	else if(percentage>=60 && percentage<=40)
	{
		printf("\n Grade=First Class");
	}
	else if(percentage<40)
	{
		printf("\n Grade=Fail Class");
	}
	printf("\n Total Marks=%d",total);
	printf("\n Percentage=%.2f",percentage);
}
