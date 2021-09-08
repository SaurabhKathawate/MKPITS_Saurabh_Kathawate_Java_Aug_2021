//1-create a structure book with members bookid, title, author and price.
struct book
{
	int bookid;
	char title[15];
	char author[15];
	float price;
}b1;

int main()
{
	//creating a structure variable
	//struct book b1;    // b1 is structure variable
	//assigning value to structure members
	b1.bookid=111;
	strcpy(b1.title,"The Voice");
	strcpy(b1.author,"Ravish Kumar");
	b1.price=499.5f;
	//displaying the values stored in structure
	printf("\nBook_id=%d",b1.bookid);
	printf("\nTitle=%s",b1.title);
	printf("\nAuthor=%s",b1.author);
	printf("\nPrice=%.2f",b1.price);
}
