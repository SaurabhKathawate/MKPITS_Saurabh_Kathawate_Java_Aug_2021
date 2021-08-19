//6- wap to accept basicsal and designation and calculate hra 12% of basic for m, hra=8% for c, hra =5% for p and total.
#include<stdio.h>
int main()
{
	int basicsal;
	float hra,total;
	char designation;
	printf("enter basicsal");
	scanf("%d",&basicsal);
	total=basicsal+hra;
	printf("enter designation m,c,p");
	fflush(stdin);     //Imp
	scanf("%c",&designation);
	printf("\n hra = %.2f",hra);
	printf("\n total= %.2f",total);
	switch(designation)
	{
		case 'm':
			hra = basicsal * 0.12f;
			break;
		case 'c':
			hra = basicsal * 0.08f;
			break;
		case 'p':
			hra = basicsal * 0.05f;
			break;
		default:
			printf("\n invalid designation ");
			break;
	}
	total=basicsal+hra;
	printf("\n hra = %d",hra);
		printf("\n total = %d",total);
}


