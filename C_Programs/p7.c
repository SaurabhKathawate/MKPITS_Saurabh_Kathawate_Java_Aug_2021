#include <stdio.h> 
void main() {
	int volume,length,breadth,height;
	printf("enter length, breadth and height");
	scanf("%d%d%d",&length,&breadth,&height);
	volume=length*breadth*height;
	printf("\n volume = %d",volume);
	
}
