import java.util.Scanner;
class Spotify
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Spotify");
		System.out.println("1. AR. Rahman");
		System.out.println("2. Anirudh");
		System.out.println("3. Yuvan Shankr Raja");
			System.out.print("Enter Music Director : ");
		int Director = sc.nextInt();
		
		switch (Director)
		{
			case 1 :
			System.out.println("AR. Rahman");
			
			System.out.println("1.Foalk");
			System.out.println("2.Melody");
			System.out.print("Enter Type : ");
			int artype = sc.nextInt();
			
			if (artype==1)
			{
				System.out.println("1. munabae Vaa");
				System.out.println("2. Enna Solla Pogirai");
				System.out.println("3. Uppu Karuvadu");
				System.out.println("4. Nee Singam Dhan");
				System.out.println("Enter song : ");
				int song = sc.nextInt();
				
			      if (song==1)
				      System.out.println("Now Playing : Munbae Vaa");
			      else if (song==2)
				      System.out.println("Now Playing : Enna Solla Pogirai");
			      else if(song==3)
				      System.out.println("Now Playing : Uppu Karuvadu");
			      else if(song==4)
				      System.out.println("Now Playing : Nee Singam Dhan");
			      else 
				      System.out.println("No Song Found");
				  
			}
            else if(artype==2)
			{
				System.out.println("1. Thayya Thayya");
				System.out.println("2. Hamma Hamma");
				System.out.println("3. Yakkai Thiri");
				System.out.println("4. Kodu Potta");
				System.out.println("Enter Song : ");
				int song = sc.nextInt();
				
				if (song==1)
					System.out.println("Now Playing : Thayya Thayya");
				else if(song==2)
					System.out.println("Now Playing : Hamma Hamma");
				else if(song==3)
					System.out.println("Now Playing : Yakkai Thiri");
				else if(song==4)
			    	System.out.println("Now Playing : Kodu Potta");
				else 
					System.out.println("Song Not Found"); 
				
			}
			else 
			{
				System.out.println("Invalid Singer");
			}
			break;
            case 2 :
			   System.out.println("Anirudh");
			   System.out.println("1. Melody");
			   System.out.println("2. Folk");
			   System.out.print("Enter type : ");
			   int anitype = sc.nextInt();
			   
			   if (anitype==1)
			   {
				   System.out.println("1. Idhazhin Oram");
				   System.out.println("2. Dheema Dheema");
				   System.out.println("3. Anbenum Ayudham Neeyae");
				   System.out.println("4. Thangapoovey");
				   System.out.println("Enter Song : ");
				   
				   int song = sc.nextInt();
				   
				   if (song==1)
					   System.out.println("Now Playing : Idhazhin Oram");
				   else if (song==2)
					   System.out.println("NOw Playing : Dheema Dheema");
				   else if (song==3)
					   System.out.println("NOw Playing : Anbenum Ayudham Neeyae");
				   else if (song==4)
					   System.out.println("NOw Playing : Thangapoovey");
				   else
					   System.out.println("Song Not Found");
			   }
			   else if (anitype==2)
			   {
				   System.out.println("1. Villain yaaru da");
				   System.out.println("2. I'm Scared");
				   System.out.println("3. Naa Ready");
				   System.out.println("4. Ordinary Person");
				   System.out.print("Enter Song : ");
				   
				   int song = sc.nextInt();
				   
				   if (song==1)
					   System.out.println("Now Playing : Villain Yaaru da");
				   else if (song==2)
					   System.out.println("NOw Playing : I'm Scared");
				   else if (song==3)
					   System.out.println("NOw Playing : Naa Ready");
				   else if (song==4)
					   System.out.println("NOw Playing : Ordinary Person");
				   else
					   System.out.println("Song Not Found");
			   }
			   else 
			{
				System.out.println("Invalid Singer");
			}
			   break;
			   
			   case 3 :
			   System.out.println("yuvan Shankar Raja");
			   System.out.println("1. Melody");
			   System.out.println("2. Folk");
			   System.out.print("Enter type : ");
			   int ysrtype = sc.nextInt();
			   
			   if (ysrtype==1)
			   {
				   System.out.println("1. Oru Nallil");
				   System.out.println("2. Kadhal Valarthen");
				   System.out.println("3. En Kadhal Solla");
				   System.out.println("4. Yaaru Illa Pon Neram");
				   System.out.println("Enter Song : ");
				   
				   int song = sc.nextInt();
				   
				   if (song==1)
					   System.out.println("Now Playing : Oru Nallil");
				   else if (song==2)
					   System.out.println("NOw Playing : Kadhal Valarthen");
				   else if (song==3)
					   System.out.println("NOw Playing : En Kadhal Solla");
				   else if (song==4)
					   System.out.println("NOw Playing : Yaaru Illa Pon Neram ");
				   else
					   System.out.println("Song Not Found");
			   }
			   else if (ysrtype==2)
			   {
				   System.out.println("1. Loosu Pennae");
				   System.out.println("2. Oru Kal Kannadi");
				   System.out.println("3. Machi Open Bottel");
				   System.out.println("4. Kadhal Assai");
				   System.out.print("Enter Song : ");
				   
				   int song = sc.nextInt();
				   
				   if (song==1)
					   System.out.println("Now Playing : Villain Yaaru da");
				   else if (song==2)
					   System.out.println("NOw Playing : I'm Scared");
				   else if (song==3)
					   System.out.println("NOw Playing : Naa Ready");
				   else if (song==4)
					   System.out.println("NOw Playing : Ordinary Person");
				   else
					   System.out.println("Song Not Found");
			   }
			   else 
			{
				System.out.println("Invalid Singer");
			}
			   break;
		      default :
			   {
			      System.out.print("Invalid Singer ");
			   }
			   break;	   
        }	
	}
}