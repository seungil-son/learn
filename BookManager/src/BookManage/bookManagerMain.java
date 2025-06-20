package BookManage;

import java.util.Scanner;

public class bookManagerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookInterface bookInterface = new BookManage();

        while(true){
            System.out.println("--도서관리 시스템--");
            System.out.println("1. Create");
            System.out.println("2. All Books");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exit");
            System.out.println("Choose one : ");
            String input = scanner.nextLine();

            switch (input)
            {
                case "1":
                    System.out.println("1. Create ");
                    System.out.println("Book id : ");
                    String id = scanner.nextLine();
                    System.out.println("Book title : ");
                    String title = scanner.nextLine();
                    System.out.println("Book author : ");
                    String author = scanner.nextLine();

                    bookInterface.create(new BookClass(id, title,author));
                    System.out.println("Complete!");

                    break;

                case "2":
                    System.out.println("2. All Books ");
                    for (BookClass book : bookInterface.FindAll()) {
                        System.out.println(book.getId() + " | " + book.getTitle() + " | " + book.getAuthor());
                    }
                    break;

                case "3":
                    System.out.println("3. Search ");
                    String Searchid = scanner.nextLine();
                    BookClass found = bookInterface.read(Searchid);

                    if(found !=null)
                    {
                        System.out.println("Id : "+found.getId());
                        System.out.println("Title : "+found.getTitle());
                        System.out.println("Author : "+found.getAuthor());
                    }
                    else
                    {
                        System.out.println("Notting");
                    }

                case "4":
                    System.out.println("4. Update");
                    String updateId = scanner.nextLine();
                    BookClass original = bookInterface.read(updateId);

                    if (original != null)
                    {
                        System.out.print("New title (now: " + original.getTitle() + "): ");
                        String newTitle = scanner.nextLine();
                        System.out.print("new autor(now: " + original.getAuthor() + "): ");
                        String newAuthor = scanner.nextLine();

                        bookInterface.update(updateId, new BookClass(updateId, newTitle, newAuthor));
                        System.out.println("Change Book Info.");
                    }
                    else
                    {
                        System.out.println("Can't find id");
                    }
                    break;

                case "5":
                    System.out.println("5. Delete ");
                    String DeleteId = scanner.nextLine();
                    bookInterface.Delete(DeleteId);
                    break;

                case "6":
                    System.out.println("6. Exit ");
                    return;

                default:
                    System.out.println("wrong input please retry 1~5");

            }


        }
    }
}
