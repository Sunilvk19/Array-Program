package practice.dekshitsir;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library library = new Library();
        while (true){
            System.out.println("\n======Menu========");
            System.out.println("1.AddBook:");
            System.out.println("2.ViewAllBook");
            System.out.println("3.BorrowBook");
            System.out.println("4.ReturnBook");
            System.out.println("5.SearchBook");
            System.out.println("6.Exit");

            System.out.println("Enter Choice: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Enter Title: ");
                    String title = scan.next();
                    System.out.println("Enter Author: ");
                    String author = scan.next();
                    System.out.println("Enter ISBN: ");
                    String isbn = scan.next();
                    System.out.println("Enter copies: ");
                    int copies = scan.nextInt();
                    library.addBook(new Book(title,author,isbn,copies));
                    break;
                case 2:
                    library.viewAllBook();
                    break;
                case 3:
                    System.out.println("Enter Isbn for search: ");
                    library.borrowBook(scan.next());
                    break;
                case 4:
                    System.out.println("Enter isbn for return: ");
                    library.returnBook(scan.next());
                    break;
                case 5:
                    System.out.println("Enter title/author for search: ");
                    library.searchBook(scan.nextLine());
                    break;
                case 6:
                    System.out.println("GoodBye.!!!");
                    scan.close();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
