//10-wap to accept age of 5 students using for loop and then display the average age.
#include<stdio.h>
int main()
{
	int age,i,total;
	float average;
	for(i=1;i<=5;i++)
	{
		printf("enter age");
		scanf("%d",&age);
		total = total + age;
	}
	
}
