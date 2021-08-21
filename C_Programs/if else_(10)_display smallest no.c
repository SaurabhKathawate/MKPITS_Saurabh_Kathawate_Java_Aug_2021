//10-wap to accept 3 no. and print the smallest no
#include<stdio.h>
int main()
{
	int n1,n2,n3;
	printf("\n Enter 3 no ");
	scanf("%d%d%d",&n1,&n2,&n3);
	if(n1<n2 && n1<n3)
	{
		printf("\n n1 is smallest no");
	}
	else if(n2<n3)
	{
		printf("\n n2 is smallest no");
	}
	else
	{
		printf("\n n3 is smallest no");
	}
}
	
