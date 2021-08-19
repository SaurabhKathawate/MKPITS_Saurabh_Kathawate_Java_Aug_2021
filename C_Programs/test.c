// -wap to accept basic salary, 25% hra, 35% da and total salary
#include<stdio.h>
void main(){
	int basic_salary;
	float hra,da,totalsalary;
	printf("enter basic salary");
	scanf("%d",&basic_salary);
	hra = basic_salary * 0.25f;
	da=basic_salary * 0.35f;
	totalsalary=basic_salary + hra + da;
	printf("\n hra = %.2f",hra );
	printf("\n da = %.2f",da );
	printf("\n total salary = %.2f",totalsalary );
}
