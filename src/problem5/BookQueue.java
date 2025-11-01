package problem5;
import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> queue;

    public BookQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(Book book) {
        queue.addLast(book);
    }

    public Book dequeue() {
        return queue.removeFirst();
    }

    public Book peek() {
        return queue.getFirst();
    }

    public void display() {
        System.out.println("Stack contents (top to bottom):");
        for (Book current : queue) {
            System.out.println(current);
        }
    }
}