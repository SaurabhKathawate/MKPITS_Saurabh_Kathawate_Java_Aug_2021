//5(A)-wap to print output like this    1	  
//		    				            2	  2
//				                        3	  3    3
//									    4	  4    4	4
//                                      5	  5    5	5	 5

int main()
{
	int r,c;
	for(r=1;r<=5;r++)
	{
		for(c=1;c<=r;c++)
		{
			printf("\t%d",r);
		}
		printf("\n");
	}
}
