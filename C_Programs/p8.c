//wap to accept length , breadth and height and print volume
#include <stdio.h> 
void main() {
	int l,b,h,volume;
	printf("enter value of l,b,h");
	scanf("%d%d%d",&l,&b,&h);
	volume=l*b*h;
	printf("\n volume=%d",volume);
}
