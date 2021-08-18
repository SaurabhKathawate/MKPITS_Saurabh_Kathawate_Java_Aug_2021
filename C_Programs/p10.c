#include <stdio.h> 
void main() {
	int n1,n2,n3,total;
	float average;
	printf("enter 3 person age");
	scanf("%d%d%d",&n1,&n2,&n3);
	total = n1+n2+n3;
	average=total / 3;
	printf("\n total age of 3 persons  = %d",total);
	printf("\n average age of 3 persons = %.2f",average);
	
}
