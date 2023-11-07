import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");
        String guestName = scan.next();

        System.out.println("Please enter your age");
        int guestAge = scan.nextInt();

        System.out.println("Please enter your hair colour");
        String guestHair = scan.next();

        System.out.println("Please enter your shirt colour");
        String guestShirt = scan.next();

        System.out.println("Please enter your pants colour");
        String guestPants = scan.next();
        String con = "";

        while (true)
        {
            //monday2
            if (guestAge <= 35 && !guestName.equals("Georgi"))
            {
                System.out.println("The guest " + guestName + " can attend on Monday");;
            }
            else
            {
                System.out.println("The guest " + guestName + " can NOT attend on Monday");
            }

            //tuesday2
            if (guestShirt.equals("red") && !guestPants.equals("white")) {
                System.out.println("The guest " + guestName + " can attend on Tuesday");
            }
            else
            {
                System.out.println("The guest " + guestName + " can NOT attend on Tuesday");
            }

            //wednesday2
            if (guestHair.equals("black") || guestHair.equals("brown") && !guestPants.equals("white") || !guestShirt.equals("white")) {
                System.out.println("The guest " + guestName + " can attend on Wednesday");
            }
            else
            {
                System.out.println("The guest " + guestName + " can NOT attend on Wednesday");
            }

            //thursday2
            if (guestAge <= 40 && guestPants.equals("blue") || guestPants.equals("red")) {
                System.out.println("The guest " + guestName + " can attend on Thursday");
            }
            else
            {
                System.out.println("The guest " + guestName + " can NOT attend on Thursday");
            }

            //friday2
            if (!guestPants.equals(guestShirt)) {
                System.out.println("The guest " + guestName + " can attend on Friday");
            }
            else
            {
                System.out.println("The guest " + guestName + " can NOT attend on Friday");
            }
            con = scan.next();
            if (con.equals("end"))
            {
                break;
            }
        }
    }
    
}