//7-wap to accept 2 no. and operator like +,-,*,/ and then display the result.
#include<stdio.h>
int main()
{
	int n1,n2;
	float res;
	char operator;
	printf("Enter 2 no \n");
	scanf("%d%d",&n1,&n2);
	printf("\nEnter operator ( + , - , * , / )\n");
	fflush(stdin); // fflush function is used to clear buffer memory
	scanf("%c",&operator);
	if(operator=='+') 
	{
		res=n1+n2;
	}
	else if(operator== '-') 
	{
		res=n1-n2;
	}
	else if(operator== '*' ) 
	{
		res=n1*n2;
	}
	else if(operator== '/' ) 
	{
		res=(float)n1/n2;
	}
	else 
	{
		printf("\n Not a valid  operator");
	} 
	printf("\n Result =%.00f",res);
}

