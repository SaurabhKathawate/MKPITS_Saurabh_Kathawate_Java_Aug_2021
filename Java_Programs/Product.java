//13-wap to accept customername, productname, productprice, quantity and then print customername, productname, price, quantity and totalamount.
import java.util.*;
class Product
{
	public static void main(String arg[])
	{
		String customer,product;
		int price,quantity,total_amount;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Customer Name");
		customer= s.next();
		System.out.println("Enter Product Name");
		product= s.next();
		System.out.println("Enter Product Price");
		price= s.nextInt();
		System.out.println("Enter Quantity");
		quantity= s.nextInt();
		total_amount=price * quantity;
		System.out.println("Customer Name: " + customer);
		System.out.println("Product Name: " + product);
		System.out.println("Product Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Total Amount: " + total_amount);
	}
}