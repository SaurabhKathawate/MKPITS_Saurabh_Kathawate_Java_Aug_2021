//5-wap to print even no between 1 and 10.
#include<stdio.h>
int main()
{
	int num=1;
	while(num<=10)
	{
		if(num % 2 == 0)
		{
			printf("\n%d",num);
    	}
    	num=num+1;
	}
}

