package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter library capacity: ");
        int n = sc.nextInt();

        Library library = new Library(n);

        // Initialize with two documents
        library.add(new Novel("The Alchemist", "Paulo Coelho", 208, 9.99));
        library.add(new Magazine("Tech Today", "October", 2025));

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Display all documents");
            System.out.println("2. Add a document");
            System.out.println("3. Delete a document");
            System.out.println("4. Search by numRec");
            System.out.println("5. Display all authors");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.displayDocuments();
                    break;

                case 2:
                    System.out.println("Choose type: 1.Book 2.Magazine 3.Dictionary");
                    int type = sc.nextInt();
                    sc.nextLine();
                    Document doc = null;
                    if (type == 1) {
                        System.out.print("Title: ");
                        String title = sc.nextLine();
                        System.out.print("Author: ");
                        String author = sc.nextLine();
                        System.out.print("Pages: ");
                        int pages = sc.nextInt();
                        System.out.print("Type 1 for Novel or 2 for Textbook: ");
                        int sub = sc.nextInt();
                        sc.nextLine();
                        if (sub == 1) {
                            System.out.print("Price: ");
                            double price = sc.nextDouble();
                            doc = new Novel(title, author, pages, price);
                        } else {
                            System.out.print("Level: ");
                            String level = sc.nextLine();
                            doc = new Textbook(title, author, pages, level);
                        }
                    } else if (type == 2) {
                        System.out.print("Title: ");
                        String title = sc.nextLine();
                        System.out.print("Month: ");
                        String month = sc.nextLine();
                        System.out.print("Year: ");
                        int year = sc.nextInt();
                        doc = new Magazine(title, month, year);
                    } else if (type == 3) {
                        System.out.print("Title: ");
                        String title = sc.nextLine();
                        System.out.print("Language: ");
                        String lang = sc.nextLine();
                        doc = new Dictionary(title, lang);
                    }

                    if (doc != null) {
                        if (library.add(doc))
                            System.out.println("Document added.");
                        else
                            System.out.println("Library full.");
                    }
                    break;

                case 3:
                    System.out.print("Enter document numRec to delete: ");
                    int numRecDel = sc.nextInt();
                    Document delDoc = library.document(numRecDel);
                    if (delDoc != null && library.delete(delDoc))
                        System.out.println("Deleted successfully.");
                    else
                        System.out.println("Document not found.");
                    break;

                case 4:
                    System.out.print("Enter numRec: ");
                    int numRec = sc.nextInt();
                    Document found = library.document(numRec);
                    System.out.println(found != null ? found : "Not found.");
                    break;

                case 5:
                    library.displayAuthors();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
