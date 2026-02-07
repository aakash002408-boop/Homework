import java.util.Scanner;

class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎵 Welcome to Spotify 🎵");
        System.out.println("1. A R Rahman");
        System.out.println("2. Anirudh");
        System.out.println("3. Yuvan Shankar Raja");
        System.out.print("Enter Music Director: ");

        int director = sc.nextInt();

        switch (director)
        {
            case 1:
                System.out.println("Selected: A R Rahman");

                System.out.println("Enter Type:");
                System.out.println("1. Melody");
                System.out.println("2. Folk");
                int type = sc.nextInt();

                if (type == 1)   // Melody
                {
                    System.out.println("Select Song:");
                    System.out.println("1. Munbe Vaa");
                    System.out.println("2. Enna Solla Pogirai");
                    System.out.println("3. Uppu Karuvadu");
                    System.out.println("4. Nee Singam Dhan");

                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Munbe Vaa");
                    else if (song == 2)
                        System.out.println("Now Playing : Enna Solla Pogirai");
                    else if (song == 3)
                        System.out.println("Now Playing : Uppu Karuvadu");
                    else if (song == 4)
                        System.out.println("Now Playing : Nee Singam Dhan");
                    else
                        System.out.println("❌ Invalid Song Selection");
                }
                else if (type == 2)   // Folk
                {
                    System.out.println("Select Song:");
                    System.out.println("1. Thayya Thayya");
                    System.out.println("2. Yakkai Thiri");
                    System.out.println("3. Kodu Potta");
                    System.out.println("4. Hamma Hamma");

                    int song = sc.nextInt();

                    if (song == 1)
                        System.out.println("Now Playing : Thayya Thayya");
                    else if (song == 2)
                        System.out.println("Now Playing : Yakkai Thiri");
                    else if (song == 3)
                        System.out.println("Now Playing : Kodu Potta");
                    else if (song == 4)
                        System.out.println("Now Playing : Hamma Hamma");
                    else
                        System.out.println("❌ Invalid Song Selection");
                }
                else
                {
                    System.out.println("❌ Invalid Music Type");
                }
                break;

            case 2:
                System.out.println("Selected: Anirudh");
                break;

            case 3:
                System.out.println("Selected: Yuvan Shankar Raja");
                break;

            default:
                System.out.println("❌ Invalid Music Director");
        }

        sc.close();
    }
}
