//7(A)-wap to print output like this    1	  2    3	4	 5
//		    				            1	  2    3	4
//				                        1	  2	   3
//				                        1	  2
//				                        1

int main()
{
	int r,c;
	for(r=5;r>=1;r--)
	{
		for(c=1;c<=r;c++)
		{
			printf("\t%d",c);
		}
		printf("\n");
	}
}
