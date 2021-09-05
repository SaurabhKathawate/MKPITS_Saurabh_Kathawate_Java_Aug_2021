//7-create a 2d array of 2 rows and 4 columns and store some value in it and display the values
#include<stdio.h>
int main()
{
	int arr[2][4];
	int r,c;
	for(r=0;r<2;r++)
	{
		for(c=0;c<4;c++)
		{
			printf("Enter number: ");
			scanf("%d",&arr[r][c]);
		}
	}
	//displaying the values of an array
	for(r=0;r<2;r++)
	{
		for(c=0;c<4;c++)
		{
			printf("\t%d",arr[r][c]);
		}
		printf("\n");
	}
}
