//8-wap to print output like this    1	  1    1
//		    				         2	  2    
//				                     3        

int main() 
{
	int row,col;
	int num=0;
	for(row=3;row>=1;row--) 
	{
		num++;
		for(col=1;col<=row;col++) 
		{
			printf("\t%d",num);
		}
		printf("\n");
		
	}
}

