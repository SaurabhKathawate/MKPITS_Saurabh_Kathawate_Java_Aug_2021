//9-wap to accept empname and designation and salary calculate bonus
#include<stdio.h>
int main()
{
	int salary,bonus,total;
	char empname[20],desg;
	printf("Enter Salary: ");
	scanf("%d",&salary);
	printf("\nEnter Employee Name: ");
	fflush(stdin);
	scanf("%c",&empname);
	printf("\nEnter Designation (m,c,p): ");
	fflush(stdin);
	scanf("%c",&desg);
	if(desg=='m')
	{
		bonus=1000;
	}
	else if(desg=='c')
	{
		bonus=500;
	}
	else if(desg=='p')
	{
		bonus=100;
	}
	//total=salary+bonus;
	printf("\nSalary = %d",salary);
	printf("\nBonus = %d",bonus);
	//printf("\n Total Salary=%d",total);
}
