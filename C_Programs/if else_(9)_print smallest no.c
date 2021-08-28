//9-wap to accept 2 no. and display the smallest no.
#include<stdio.h>
int main()
{
	int n1,n2;
	printf("Enter 2 no ");
	scanf("%d%d",&n1,&n2);
	if(n1<n2)
	{
		printf("\n n1 is smallest no");
	}
	else
	{
		printf("\n n2 is smallest no");
	}
}
