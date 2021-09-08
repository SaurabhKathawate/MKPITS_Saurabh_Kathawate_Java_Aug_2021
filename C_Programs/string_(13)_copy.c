//13-wap to copy a string
#include<string.h>
int main()
{
	char ch[15];
    char ch1[15];
    int length;
    printf("enter string: ");
    gets(ch);
    strcpy(ch1,ch);
    printf("\nstring1 = %s",ch);
    printf("\nstring2 = %s",ch1);
}

