class Restaurant 
{
	public static void main(String[] args)
	{
		String foodname = "Chicken Biriyani";
		String cuisinetype = "India";
		byte quantity = 2;
		double priceperplate = 100.5;
		boolean isveg = false;
		byte discount = 10;
		double totalprice = quantity * priceperplate;
		double discountamount = totalprice * discount / 100;
		double finalprice = totalprice - discountamount;
		
		System.out.println("Food Name : " + foodname);
		System.out.println("Cuisinetype : " + cuisinetype);
		System.out.println("Quantity : " + quantity);
		System.out.println("Priceperplate : " + priceperplate);
		System.out.println("is veg : " + isveg);
		System.out.println("Discount : " + discount);
		System.out.println("Total Price : " + totalprice);
		System.out.println("Discount Amount : " + discountamount);
		System.out.println("Final Price : " + finalprice);
		
	}
}