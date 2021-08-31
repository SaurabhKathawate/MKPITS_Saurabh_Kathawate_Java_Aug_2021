//4-wap to accept salary and calculate bonus and total salary using goto statement.
#include<stdio.h>
int main()
{
	int sal,bonus,tsal;
	char designation;
	printf("Enter salary: ");
	scanf("%d",&sal);
	fflush(stdin);
	printf("Enter Designation like (m,c,p): ");
	scanf("%c",&designation);
	if(designation=='m')
	{
		goto manager;
	}
	else if(designation=='c')
	{
		goto clerk;
	}
	else if(designation=='p')
	{
		goto peon;
	}
	else
	{
		printf("\nInvalid designation");
		goto end;
	}
	//creating labels for goto statement
	manager:
		bonus=1200;
		//tsal=sal+bonus;
		goto end;
	clerk:
	    bonus=800;
	    //tsal=sal+bonus;
	    goto end;
	peon:
		bonus=500;
		//tsal=sal+bonus;
		goto end;
	end:
	tsal=sal+bonus;	
	printf("\nBonus=%d",bonus);
	printf("\nTotal Salary=%d",tsal);	
}

