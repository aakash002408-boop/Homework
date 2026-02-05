class Mobile
{
	public static void main(String[] args)
	{
		int battery = 82;
		
		if (battery>80)
		{
			System.out.println("Batter full");
		}
		else if (battery>=30&&battery<=70)
		{
			System.out.println("Battery  Normal");
		}
		else 
			System.out.println("Bad");
	}
}