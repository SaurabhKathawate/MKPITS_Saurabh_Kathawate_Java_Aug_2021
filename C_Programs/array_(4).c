//4-wap to create an float array of 5 elements to store 5 decimal no,
//accept 5 no from the user and store it in an array usimg for loop
//then display the value stored in an array.
#include<stdio.h>
int main()
{
	int i;
	float num[5];
	for(i=0;i<5;i++)
	{
		printf("\n Enter no: ");
		scanf("%f",&num[i]);
	}
	for(i=0;i<5;i++)
	{
		printf("\n num[%d]=%f",i,num[i]);
	}
}
 
