//12-create a structure array of 5 elements of structure book.
struct book
{
	int id;
	char name[20];
	char price;
}
void display(struct b1)
#include<stdio.>
int main()
{
	struct book b[5];
	int i=5;
	while(i<5)
	{
		printf("\nEnter Bookid: ");
		gets(b[i].id);
		printf("\nEnter Book Name: ");
		gets(b[i].name);
		printf("\nEnter Price: ");
		gets(b[i].price);
		
		printf("\n--------------Book [%d] details are:-------------",i+1);
		display(b[i]);
		i++
	}
}
void display(struct b1)
{
	printf("\nBookid=%d",b[i].id);
}
