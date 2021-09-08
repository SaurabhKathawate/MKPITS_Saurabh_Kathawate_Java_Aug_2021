//1-wap to create a character array of 10 elements to store a name
#include<stdio.h>
int main() 
{
	char name[10]= {'a','n','k','i','t','a','\0'};
	int i;
	for(i=0;i<10;i++)
	{
		printf("%c",name[i]);
	}
	printf("\nname = %s",name);
}

