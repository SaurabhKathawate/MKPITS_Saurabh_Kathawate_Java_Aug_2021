//8-wap to accept basicsalary and designation like 'm' for manager ,'c' for clerk and 'p' for peon
//and then calculate bonus=1000 for 'm', 500 for 'c', 100 for 'p'and display basicsalary,bonus & totalsalary
#include<stdio.h>
int main()
{
	int basicsal,bonus,total;
	char designation;
	printf("Enter Basicsal \n");
	scanf("%d",&basicsal);
	printf("enter designation (m,c,p) \n");
	fflush(stdin);     //Imp
	scanf("%c",&designation);
	if(designation=='m')
	{
		bonus=1000;
	}
	else if(designation=='c')
	{
		bonus=500;
	}
	else if(designation=='p')
	{
		bonus=100;
	}
	total=basicsal+bonus;
	printf("\n basic salary = %d",basicsal);
	printf("\n bonus = %d",bonus);
	printf("\n Total Salary=%d",total);
}

