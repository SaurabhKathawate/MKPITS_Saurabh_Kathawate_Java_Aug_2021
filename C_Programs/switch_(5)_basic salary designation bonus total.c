//5-wap to accept basic salary,designation and calculate bonus 1000 for m, 500 for c, 100 for p and total.
#include<stdio.h>
int main()
{
	int basicsal,bonus,total;
	char designation;
	printf("\nEnter basicsal: ");
	scanf("%d",&basicsal);
	printf("\nEnter designation (m,c,p): ");
	fflush(stdin);     //Imp
	scanf("%c",&designation);
	switch(designation)
	{
	    case 'm':
			bonus=1000;
			break;
		case 'c':
			bonus=500;
			break;
		case 'p':
			bonus=100;
			break;
		default:
			printf("\nInvalid designation ");
			break;
	}
	total=basicsal+bonus;
	printf("\nBonus = %d",bonus);
		printf("\nTotal = %d",total);
}
