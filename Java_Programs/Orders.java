//create a package mkpits2 and a class orders having field orderno, orderdate(string), customername, productname, price and quantity
//and methods insert, calculate totalbillamount and display.

package mkpits2;
public class Orders
{
	int orderno;
	string orderdate;
	string customername;
	string productname;
	float price;
	int quantity;

	public void insert(int on, string od, string cn,string pn, float p, int q)
	{
		orderno=on;
		orderdate=od;
		customername=cn;
		productname=pn;
		price=p;
		quantity=q;
	}

	public void totalbillamount()
	{
		total=price * quantity;
	}
	public void display()
	{
		System.out.println("Total Amount: "+total);
	}







}