//1-example of goto statement to do calculation.
#include<stdio.h>
int main() 
{
	int n1,n2,res;
	char op;
    printf("enter 2 no");
    scanf("%d%d",&n1,&n2);
    fflush(stdin); // used to clear buffer memory
    printf("enter operator like (+,-,*): ");
    scanf("%c",&op);
    if(op == '+' )
    {
    	goto add ;
	}
	//creating labels for goto statement
	add:
		res==n1+n2;
		printf("\nResult=%d",res);
		goto end;
    sub:
    	printf("\nsub");
    mul:
    	printf("\nmul");
    end:
    	printf("\nbye");
}

