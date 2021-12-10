import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    ContactView contactView = new ContactView();


        public Main() {
            System.out.println("-----MENU MANAGE CONTACT -----");
            System.out.println("1.Show List Contact:\n" +
                    "2.Create New Contact:\n" +
                    "3.Delete A Contact:\n" +
                    "4.Detail A Contact:\n" +
                    "5.Edit A ConTact:\n"

            );
            int choice = scanner.nextInt();
            switch (choice){
                case 1: {
                    contactView.formShowListContacts();
                    break;
                }
                case 2: {
                    contactView.formCreatAContact();
                    break;
                }
                case 3: {
                    contactView.formDeleteContact();
                  break;
                }
                case 4: {
                    contactView.formDetailContacts();
                break;
                }
                case 5: {
                    contactView.formEditStudent();

                    break;
                }
                case 6: {
                }
                case 7: {
                }

            }

        }




    public static void main(String[] args) {

        new Main();

    }


    }


