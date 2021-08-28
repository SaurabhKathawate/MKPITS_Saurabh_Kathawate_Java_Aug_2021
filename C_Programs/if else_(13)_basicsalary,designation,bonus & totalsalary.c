//13-wap to accept basicsalary and designation like 'm' for manager,'c' for clerk and 'p' for peon.
//and then calculate bonus=50% of basicsalary for 'm', bonus=40% of basicsalary for 'c', bonus=30% of basic salary  for 'p'
//and display basicsalary,bonus and totalsalary.
#include<stdio.h>
int main()
{
	int bs;
	float bonus,ts;
	char designation;
	printf("\n Enter Basic Salary: ");
	scanf("%d",&bs);
	printf("\n Enter Designation (m,c,p): ");
	fflush(stdin);
	scanf("%c",&designation);
	if(designation=='m')
	{
		bonus = bs * 0.50f;
        ts = bs + bonus;
        printf("\n Basic Salary=%d",bs);
        printf("\n Bonas=%.2f",bonus);
        printf("\n Total Salary=%.2f",ts);
	}
	else if(designation=='c')
	{
		bonus = bs * 0.40f;
        ts = bs + bonus;
        printf("\n Basic Salary=%d",bs);
        printf("\n Bonas=%.2f",bonus);
        printf("\n Total Salary=%.2f",ts);
	}
	else if(designation=='p')
	{
		bonus = bs * 0.30f;
        ts = bs + bonus;
        printf("\n Basic Salary=%d",bs);
        printf("\n Bonas=%.2f",bonus);
        printf("\n Total Salary=%.2f",ts);
	}
}

