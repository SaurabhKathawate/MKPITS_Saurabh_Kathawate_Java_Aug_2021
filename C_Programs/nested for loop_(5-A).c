//5(A)-wap to print output like this    1	  
//		    				            1	  2
//				                        1	  2    3
//									    1	  2    3	4
//                                      1	  2    3	4	 5

int main()
{
	int r,c;
	for(r=1;r<=5;r++)
	{
		for(c=1;c<=r;c++)
		{
			printf("\t%d",c);
		}
		printf("\n");
	}
}
