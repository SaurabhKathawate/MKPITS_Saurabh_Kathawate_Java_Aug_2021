//Calculate the electricity bill based on the below parameters
//The bill will be calculated as per below slab
//0-100 units (Rs. 3.44 per unit)
//101-300 units (Rs. 7.34 per unit)
//301-500 units (Rs. 10.36 per unit)
//501-1000 units (Rs. 11.82 per unit)
//>1000 units (Rs. 11.82 per unit)
//Apart from the above slab, there are few fixed costs added to each bill as below
//Mandatory Cost: Rs. 200
//Vehicle Cost @ 1.38 per unit
//Tax @ 16% on total cost

import java.util.*;
class Project_ElectricityBill
{
	public static void main(String arg[])
	{
		int units;
		double cost=0, man_cost=200, veh_cost, tax, total_cost, total_amount;

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Units: ");
		units=s.nextInt();

		if(units<=100)
		cost = 3.44 * units;
		else if(units>100 && units<=300)
		cost = 7.34 * units;
		else if(units>300 && units<=500)
		cost = 10.36 * units;
		else if(units>500 && units<=1000)
		cost = 11.82 * units;
		else if(units>1000)
		cost = 11.82 * units;
		System.out.println("Cost: "+cost);

		System.out.println("Mandatory Cost: "+man_cost);

		veh_cost = 1.38 * units;
		System.out.println("Vehicle Cost: "+veh_cost);

		total_cost = cost + man_cost + veh_cost;
		System.out.println("Total Cost: "+total_cost);

		tax = 0.16 * total_cost;
		System.out.println("Tax: "+tax);


		total_amount = total_cost + tax;
		System.out.println("--------------------------------------------------");
		System.out.println("Total Amount to be paid by Consumer: "+total_amount);
	}
}