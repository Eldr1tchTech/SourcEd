import java.util.Scanner;

public class SourcEdIO {

    private Product[] ProductList;

    private void EditIOStream() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you would like to return to the main mVIenu enter: MAIN MENU\nEnter a product ID: ");
        String input = scanner.nextLine();
        if (input.equals("MAIN MENU")) {
            MainMenu();
        } else {
            for (Product a : ProductList) {
                if (a.IDHex == input) {
                    EditProductIOStream(a);
                } else {
                    ViewIOStream(a);
                }
            }
        }
        scanner.close();
    }

    private void EditProductIOStream(Product a) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("If you would like to return to the main menu enter: MAIN MENU\nYou are now editing product " + a.IDHex + ".\nIf you would like to continue enter: CONTINUE");
        String input = scanner.nextLine();
        if (input.equals("MAIN MENU")) {
            MainMenu();
        } else if (input.equals("CONTINUE")) {
            
        } else {
            System.out.println("Please enter a valid value");
            EditProductIOStream(a);
        }
        scanner.close();
    }

    private void ViewIOStream(Product a) {
        Scanner scanner = new Scanner(System.in);
        Product c = null;
        if (a == null) {
            System.out.println("Please enter a product ID to view");
            for (Product b : ProductList) {
                if (scanner.nextLine() == b.IDHex) {
                    c = b;
                }
            }
            if (c != null) {
                ViewIOStream(c);
            } else {
                System.out.println("Please enter a valid product ID");
                ViewIOStream(null);
            }
        } else {
            System.out.println("If you ould like to return the the main menu enter: MAIN MENU\nIf you would like to view the product enter: CONTINUE");
            if (scanner.nextLine() == "MAIN MENU") {
                MainMenu();
            } else if (scanner.nextLine() == "CONTINUE") {
                
            } else {
                System.out.println("Please enter a valid Product ID");
            }
        }
        scanner.close();
    }

    public void MainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you would like to add or edit a product enter: EDIT\nIf you would like to view a product enter: VIEW");
        String a = scanner.nextLine();
        if (a == "ADD") {
            scanner.close();
            EditIOStream();
        } else if (a == "VIEW") {
            scanner.close();
            ViewIOStream(null);
        } else {
            System.out.println("Please enter a valid option.");
            scanner.close();
            MainMenu();
        }
        scanner.close();
    }
}