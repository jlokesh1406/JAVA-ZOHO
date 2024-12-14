import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loop=true;
        Scanner scan = new Scanner(System.in);
        while(loop)
        {
            System.out.println("1.Book \n2.Cancel \n3.Available \n4.Booked Tickets \n5.Exit");
            int chioce = scan.nextInt();
            switch(chioce) 
            {
                case 1:
                {
                    System.out.println("Enter the Passenger Name:");
                    String name=scan.next();
                    System.out.println("Enter the Passenger Age:");
                    int age=scan.nextInt();
                    System.out.println("Enter the Passenger Gender:[M,F]");
                    String gender = scan.next();
                    System.out.println("Enter the Passenger Berth Preference :[L,M,U]");
                    String berthPreference=scan.next();
                    Passenger p = new Passenger(name, age, gender, berthPreference); 
                    break;
                }
                case 5:
                    loop=false;
                    break;
            }
        }
    }
}
