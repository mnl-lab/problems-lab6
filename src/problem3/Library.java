package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;

    public Library(int capacity) {
        this.capacity = capacity;
        this.documents = new ArrayList<>();
    }

    public boolean add(Document doc) {
        if (documents.size() >= capacity) return false;
        return documents.add(doc);
    }

    public boolean delete(Document doc) {
        return documents.remove(doc);
    }

    public Document document(int numRec) {
        for (Document doc : documents) {
            if (doc.getNumRec() == numRec)
                return doc;
        }
        return null;
    }

    public void displayDocuments() {
        if (documents.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }
        for (Document doc : documents) {
            System.out.println(doc);
        }
    }

    public void displayAuthors() {
        for (Document doc : documents) {
            if (doc instanceof Book) {
                Book b = (Book) doc;
                System.out.println("Author: " + b.getAuthor());
            }
        }
    }
}
