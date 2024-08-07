package spring.SpringProj;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryTest {
    public static void main(String[] args) {
        // Using try-with-resources to ensure context is closed
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("library.xml")) {
            Library lib = (Library) context.getBean("lib");
            List<Book> books = lib.getBooks();
            for (Book b : books) {
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
