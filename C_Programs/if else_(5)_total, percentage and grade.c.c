//5-wap to accept 3 subject marks and calculate total, percentage and grade
#include<stdio.h>
void main()
{
	int s1,s2,s3,total;
	float percentage;
	printf("enter marks");
	scanf("%d%d%d",&s1,&s2,&s3);
	total=s1+s2+s3;
	
	percentage=(total/300.0f)*100.0f;
	printf("\n Total Marks=%d",total);
	printf("\n Percentage=%.2f",percentage);
	if(percentage>=75)
	{
	printf("\n Grade=Distinction");
	}
	else if(percentage>=60 && percentage<75)
	{
    printf("\n Grade=First Class");
	}
	else
	{
	printf("\n Grade=Pass Class");	
	}
}
