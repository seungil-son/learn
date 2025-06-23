import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookRepository manager = new BookManager();

        while (true) {
            System.out.println("\n---- 도서관리 시스템 ----");
            System.out.println("1. 도서 등록");
            System.out.println("2. 전체 목록");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택 >> ");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("도서 ID: ");
                    String id = scanner.nextLine();
                    System.out.print("제목: ");
                    String title = scanner.nextLine();
                    System.out.print("저자: ");
                    String author = scanner.nextLine();

                    manager.create(new BookClass(id, title, author));
                    System.out.println(" 등록 완료!");
                    break;

                case "2":
                    System.out.println(" 도서 목록:");
                    for (BookClass book : manager.findAll()) {
                        System.out.println(book.getId() + " | " + book.getTitle() + " | " + book.getAuthor());
                    }
                    break;

                case "3":
                    System.out.print("검색할 도서 ID 입력: ");
                    String searchId = scanner.nextLine();
                    BookClass found = manager.read(searchId);
                    if (found != null) {
                        System.out.println(found.getTitle() + " by " + found.getAuthor());
                    } else {
                        System.out.println("해당 도서를 찾을 수 없습니다.");
                    }
                    break;

                case "4":
                    System.out.print("삭제할 도서 ID 입력: ");
                    String deleteId = scanner.nextLine();
                    manager.delete(deleteId);
                    System.out.println("삭제 완료!");
                    break;

                case "5":
                    System.out.println("시스템 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 1~5 사이 숫자를 입력해주세요.");
            }
        }
    }
}
