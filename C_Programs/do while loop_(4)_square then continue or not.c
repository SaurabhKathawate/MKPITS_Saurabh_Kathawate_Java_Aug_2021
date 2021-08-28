//4-wap to accept a number and print square of that number program should ask the user "do you want to continue or not, 
//if user press'y' and then it should ask for another number and if user presses 'n' the program should end.
#include<stdio.h>
int main()
{
	int num,square;
	char ans;
	do
	{
		printf("\nEnter number: ");
	    scanf("%d",&num);
	    square=num*num;
	    printf("\nSquare=%d",square);
	    printf("\nDo you want to continue if yes press y otherwise n: ");
	    fflush(stdin);
	    scanf("%c",&ans);
	}
	while(ans=='y');
	printf("\n The End");
}

