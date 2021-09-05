//4-wap to accept designation like m,c,p and display the full designation.
#include<stdio.h>
int main()
{
	char designation;
	printf("\nEnter designation (m,c,p): ");
	fflush(stdin);    //Imp
	scanf("%c",&designation);
	switch(designation)
	{
		case 'm':
			printf("\n manager");
			break;
		case 'c':
			printf("\n clerk");
			break;
		case 'p':
			printf("\n peon");
			break;
		default:
			printf("\n invalid designation ");
			break;
	}
}
