package problem5;

public class Main {
    public static void main(String[] args) {
        BookStack bookStack = new BookStack();
        BookQueue bookQueue = new BookQueue();

        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("Clean Code", "Robert C", 2008);
        Book book3 = new Book("The Hobbit", "J.R.R Tolkien", 1937);

        // Using BookStack
        bookStack.push(book1);
        bookStack.push(book2);
        bookStack.push(book3);

        System.out.println("Book Stack:");
        bookStack.display();

        System.out.println("\nPopped from stack: " + bookStack.pop());
        System.out.println("Top of stack: " + bookStack.peek());

        System.out.println("\nBook Stack after pop:");
        bookStack.display();

        // Using BookQueue
        bookQueue.enqueue(book1);
        bookQueue.enqueue(book2);
        bookQueue.enqueue(book3);

        System.out.println("\nBook Queue:");
        bookQueue.display();

        System.out.println("\nDequeued from queue: " + bookQueue.dequeue());
        System.out.println("Front of queue: " + bookQueue.peek());

        System.out.println("\nBook Queue after dequeue:");
        bookQueue.display();
    }
}
