package PhoneBook;

import java.util.Scanner;

 public class PhoneBookMain {
    static Scanner contact = new Scanner(System.in);
     private static String lastName;
     private static String phoneNumber;

     public static void main(String[] args) {
        mainMenu();
    }


    public static void mainMenu(){
        System.out.println("""
                1-> add new contact
                2 -> search phone number
                3 -> exit
                """);

        int menu = Integer.parseInt(contact.nextLine());
        switch (menu){
            case 1:
                addPhoneNumber();
            case 2:
                searchPhoneNumber();
            case 3:
                exits();
                break;
            default:
                System.out.println("wrong input");
        }


    }

    private static void exits() {
        System.out.println("Thank you for using our Phone Book app..");
    }

    private static void searchPhoneNumber() {
        System.out.print("Enter first name: ");
        String firstName = contact.nextLine();

        PhoneBook user = new PhoneBook();

        String name = String.valueOf(user.searchPhoneNumber(firstName));

        System.out.println(name);
        System.out.println(phoneNumber);
        mainMenu();
    }

    private static void addPhoneNumber() {
        System.out.print("Enter the first Name:");
        String firstName = contact.nextLine();

        System.out.print("Enter the last Name:");
        String lastName = contact.nextLine();

        System.out.print("Enter phoneNumber:");
        String phoneNumber = contact.nextLine();

        PhoneBook myPhoneBook = new PhoneBook();
        PhoneBook contact = new PhoneBook(firstName,lastName,phoneNumber);
        myPhoneBook.savePhoneNumber(firstName,lastName,phoneNumber);

        System.out.println("You have successfully added a new contact.... \n");
        System.out.println(contact);
        mainMenu();


    }
}

