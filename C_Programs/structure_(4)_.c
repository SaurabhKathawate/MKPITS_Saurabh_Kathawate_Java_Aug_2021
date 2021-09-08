//4-create a structure product with productid,productname,productprice.
#include<stdio.h>
struct product
{
	int prod_id;
	char prod_name[20];
	float prod_price;
}p1;
int main()
{
	//struct product p1;
	p1.prod_id=123;
	strcpy(p1.prod_name,"Mobile");
	p1.prod_price=15499.5f;
	
	printf("\nProduct ID=%d",p1.prod_id);
	printf("\nProduct Name=%s",p1.prod_name);
	printf("\nProduct Price=%.2f",p1.prod_price);
}
