//6(B)-wap to print output like this    *    *    *
//		    				            *    *
//				                        *

int main() 
{
	int row,col;
	for(row=3;row>=1;row--) 
	{
		for(col=1;col<=row;col++) 
		{
			printf("\t*");
		}
		printf("\n");
		
	}
}
