//9(B)-wap to print output like this    1	 
//		    			   	            1	3
//				                        1   3   5
#include<stdio.h>
int main()
{
	int num, i,j;
	for(i=1;i<=3;i++)
	{
		num=1;
		for(j=1;j<=i;j++)
		{
			printf("\t%d",num);
			num=num+2;
		}
		printf("\n");
	}
}
