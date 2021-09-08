//4-create an array to store 5 productname and price and display the product name and pass array to function to calculate price
#include<stdio.h>
int main() 
{
	char prod_name[5][20]; // 2d array of 5 rows and 20 columns to store 5 product names
	int price[5],i;
	for(i=0;i<5;i++) 
	{
		printf("\nenter 5 product name: ");
		scanf("%s",&prod_name[i]);
		printf("\nenter 5 product price: ");
		scanf("%d",&price[i]);
	}
	for(i=0;i<5;i++) {
		printf("\n product name = %s",prod_name[i]);
	}
	calculate_price(price); // passing array to function
}

void calculate_price(int pr[]) {
	int total=0,i;
	
		for(i=0;i<5;i++) {
			
			total=total + pr[i];
		}
		printf("\ntotal price of products  = %d",total);
}
