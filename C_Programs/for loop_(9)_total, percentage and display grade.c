//9-wap to accept 5 subject marks using for loop & print total, percentage and display grade using if else if statement.
#include<stdio.h>
int main() 
{
	int marks,total,i;
	float per;
	for(i=1;i<=5;i++)
	{
		printf(" Enter marks: ");
		scanf("%d",&marks);
		total = total + marks;
	}
	printf("\n Total marks = %d",total);
	per=(float) (total / 500.0f) * 100.0f;
    printf("\n Percentage= %.2f",per);
    if(per >= 75)
    {
    	printf("\n Grade=Distinction");
	}
	else  if(per >= 60 && per <75)
	{
		printf("\n Grade=first");
	}
	else
	{
		printf("\n Grade = fail");
	}
}

