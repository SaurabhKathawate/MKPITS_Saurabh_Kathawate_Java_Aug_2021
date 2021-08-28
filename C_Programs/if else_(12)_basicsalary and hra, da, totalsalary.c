//12-wap to accept basicsalary and calculate hra,da and totalsalary.
//(hra=50% of basicsalary,da=40% of basicsalary if basicsalary >=10000)
//(hra=30% of basicsalary,da=20% of basicsalary if basicsalary >=5000)
//(hra=10% of basicsalary,da=05% of basicsalary if basicsalary < 5000)
#include<stdio.h>
int main()
{
	int bs;
	float hra,da,ts;
	printf("\n Enter Basic Salary ");
	scanf("%d",&bs);
    fflush(stdin);
	if(bs>=10000)
	{
		hra = bs * 0.50f;
	    da = bs * 0.40f;
	    ts = bs + hra + da;
		printf("\n hra = %.2f",hra );
	    printf("\n da = %.2f",da );
	    printf("\n total salary = %.2f",ts);
	}
	else if(bs>=5000 && bs<10000)
	{
		hra = bs * 0.30f;
	    da = bs * 0.20f;
	    ts = bs + hra + da;
		printf("\n hra = %.2f",hra );
	    printf("\n da = %.2f",da );
	    printf("\n total salary = %.2f",ts);
	}
	else if(bs<5000)
	{
		hra = bs * 0.10f;
	    da = bs * 0.05f;
	    ts = bs + hra + da;
		printf("\n hra = %.2f",hra );
	    printf("\n da = %.2f",da );
	    printf("\n total salary = %.2f",ts);
	}
}

