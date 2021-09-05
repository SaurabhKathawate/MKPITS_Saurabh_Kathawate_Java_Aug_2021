//6-create a 2d array of 3 rows and 4 columns and store some value in it and display the values
#include<stdio.h>
int main()
{
	int arr[3][4];
	int r,c;
	for(r=0;r<3;r++)
	{
		for(c=0;c<4;c++)
		{
			printf("Enter number: ");
			scanf("%d",&arr[r][c]);
		}
	}
	for(r=0;r<3;r++)
	{
		for(c=0;c<4;c++)
		{
			printf("\t%d",arr[r][c]);
		}
		printf("\n");
	}
}
