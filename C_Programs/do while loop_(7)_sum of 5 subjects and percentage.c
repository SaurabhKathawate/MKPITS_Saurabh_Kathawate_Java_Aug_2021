//7-wap to accept 5 subject marks using do while loop and print the sum of 5 subjects and percentage
#include<stdio.h>
int main()
{
	int marks,sum,i=1;
	float per;
	do
	{
		printf("enter marks[%d] ",i);
		scanf("%d",&marks); //2 3 4 5 6
		sum=sum+marks;  // sum = 14 + 6
		i++;
	}while(i<=5);
	printf("\n sum of 5 subject marks = %d",sum);
	per=(float) (sum/500.0f) * 100.0f;
	printf("\n percentage = %.2f",per);
}

