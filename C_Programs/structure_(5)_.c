//5-create a structure book and create 2 structure variable b1 and b2
// create a structure book with members bookid, title, author and price.
struct book 
{
	int bookid;
	char title[15];
	char author[15];
	float price;
}b1,b2;
 
 int main() 
 {
 	//creating a structure variable
	//struct book b1;    // b1 is structure variable
	//assigning value to structure members
	b1.bookid=111;
	strcpy(b1.title,"The Voice");
	strcpy(b1.author,"Ravish Kumar");
	b1.price=499.5f;
	//displaying the values stored in b1 structure
	printf("\nBook 1 details");
	printf("\nBook_id=%d",b1.bookid);
	printf("\nTitle=%s",b1.title);
	printf("\nAuthor=%s",b1.author);
	printf("\nPrice=%.2f",b1.price);
	printf("\n--------------------------------");
	
	//creating a structure variable
	//struct book b2;    // b2 is structure variable
	//assigning value to structure members
    b2.bookid=124;
    strcpy(b2.title,"Bolna hi hai");
    strcpy(b2.author,"Ravish Kumar");
    b2.price=599.5f;
    //displaying the values stored in b2 structure.
    printf("\nBook 2 details");
    printf("\nBook_id=%d",b2.bookid);
    printf("\nTitle=%s",b2.title);
    printf("\nAuthor=%s",b2.author);
    printf("\nPrice=%.2f",b2.price);
 }

