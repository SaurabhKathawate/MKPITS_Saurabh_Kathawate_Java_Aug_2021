//10-wap to accept age of 3 person and calculate their total and average age.
#include <stdio.h> 
int main() 
{
	int n1,n2,n3,total;
	float average;
	printf("enter 3 person age");
	scanf("%d%d%d",&n1,&n2,&n3);
	total = n1+n2+n3;
	average=(float)total / 3;
	printf("\n total age of 3 persons  = %d",total);
	printf("\n average age of 3 persons = %.2f",average);
}

