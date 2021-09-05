//C-function with return value and with parameters
//11-wap to create a function calculate with 3 parameters (2 int and one char to accept 2 no. and operator) 
//calculate and return the result
#include<stdio.h>
int cal(int n1, int n2, char op)
{
	int result;
	switch(op)
	{
		case '+':
		    result=n1+n2;
		    break;
		case '-':
		    result=n1-+n2;
		    break;
		case '*':
		    result=n1*n2;
		    break;
		default:
			printf("\nInvalid Operator");
			break;
	}
	return result;
}
//creating a main function
int main()
{
	int n1,n2,res;
	char op;
	printf("\nEnter 2 no: ");
	scanf("%d%d",&n1,&n2);
	printf("\nEnter Operator like (+,-,*): ");
	fflush(stdin);
	scanf("%c",&op);
	//calling the function calculate and passing 3 arguments
	res=cal(n1,n2,op);
	printf("\nResult=%d",res);
}

