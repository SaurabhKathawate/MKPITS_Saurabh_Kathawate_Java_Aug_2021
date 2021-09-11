//7-wap to accept empname,salary and calculate bonus.
#include<stdio.h>
int main()
{
	int salary,bonus;
	char empname;
	printf("Enter Salary: ");
	scanf("%d",&salary);
	printf("Enter Employee Name: ");
	fflush(stdin);
	scanf("%c",&empname);
	if(salary>=10000)
	{
		printf("\nBonus=1000");
	}
	else
	{
		printf("\nBonus=500");
	}
	//total_salary=salary+bonus;
	//Printf("Total Salary=%d",total_salary);
}
