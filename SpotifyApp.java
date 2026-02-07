import java.util.Scanner;

class SpotifyApp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎵 Welcome to Spotify Music App 🎵");
        System.out.println("Select Music Director:");
        System.out.println("1 → A R Rahman");
        System.out.println("2 → Anirudh");
        System.out.println("3 → Yuvan Shankar Raja");

        int director = sc.nextInt();

        switch (director)
        {
            case 1:
                System.out.println("Selected: A R Rahman");
                showMusicMenu(sc, "A R Rahman");
                break;

            case 2:
                System.out.println("Selected: Anirudh");
                showMusicMenu(sc, "Anirudh");
                break;

            case 3:
                System.out.println("Selected: Yuvan Shankar Raja");
                showMusicMenu(sc, "Yuvan Shankar Raja");
                break;

            default:
                System.out.println("❌ Invalid Music Director");
        }

        sc.close();
    }

    // Method to show Music Type and Songs
    static void showMusicMenu(Scanner sc, String director)
    {
        System.out.println("Select Music Type:");
        System.out.println("1 → Melody");
        System.out.println("2 → Folk");

        int type = sc.nextInt();

        if (type == 1)   // Melody
        {
            System.out.println("Melody Songs:");
            System.out.println("1 → Song A");
            System.out.println("2 → Song B");

            int song = sc.nextInt();

            if (song == 1)
            {
                System.out.println("🎶 Now Playing : Melody Song A by " + director);
            }
            else if (song == 2)
            {
                System.out.println("🎶 Now Playing : Melody Song B by " + director);
            }
            else
            {
                System.out.println("❌ Invalid Song Selection");
            }
        }
        else if (type == 2)   // Folk
        {
            System.out.println("Folk Songs:");
            System.out.println("1 → Song X");
            System.out.println("2 → Song Y");

            int song = sc.nextInt();

            if (song == 1)
            {
                System.out.println("🎶 Now Playing : Folk Song X by " + director);
            }
            else if (song == 2)
            {
                System.out.println("🎶 Now Playing : Folk Song Y by " + director);
            }
            else
            {
                System.out.println("❌ Invalid Song Selection");
            }
        }
        else
        {
            System.out.println("❌ Invalid Music Type");
        }
    }
}
