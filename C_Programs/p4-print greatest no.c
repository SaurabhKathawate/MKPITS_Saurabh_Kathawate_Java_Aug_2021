//4-wap to accept 3no. and print greatest no
#include<stdio.h>
void main(){
	int n1,n2,n3;
	printf("enter 3 no");
	scanf("%d%d%d",&n1,&n2,&n3);
	if(n1>n2 && n1>n3)
	{
		printf("\n n1 is greater");
	}
	else if(n2>n3)
	{
		printf("\n n2 is greater");
	}
	else
	{
		printf("\n n3 is greater");
	}
	
}

