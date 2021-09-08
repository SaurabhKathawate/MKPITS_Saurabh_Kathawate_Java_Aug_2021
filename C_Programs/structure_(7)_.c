//7-create a structure product and accept values from the user
struct product
{
	int prodid;
	char prodname[15];
	int prodprice;
}p;

int main()
{
	printf("\nProduct ID: ",p.prodid);
	scanf("%d",&p.prodid);
	printf("\nProduct Name: ",p.prodname);
	scanf("%s",&p.prodname);
	printf("\nProduct Price: ",p.prodprice);
	scanf("%d",&p.prodprice);
	
	printf("\nProduct details are:");
	printf("\n--------------------------------");
	printf("\nProduct ID=%d",p.prodid);
	printf("\nProduct Name=%s",p.prodname);
	printf("\nProduct Price=%d",p.prodprice);
}
