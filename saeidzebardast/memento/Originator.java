package ir.zebardast.java.designpatterns.memento;

// Memento Design Pattern

public class Originator {

    private String article;

    // Sets the value for the article

    public void set(String newArticle) {
        System.out.println("From Originator: Current Version of Article\n" + newArticle + "\n");
        this.article = newArticle;
    }

    // Creates a new Memento with a new article

    public Memento storeInMemento() {
        System.out.println("From Originator: Saving to Memento");
        return new Memento(article);
    }

    // Gets the article currently stored in memento

    public String restoreFromMemento(Memento memento) {

        article = memento.getSavedArticle();

        System.out.println("From Originator: Previous Article Saved in Memento\n" + article + "\n");

        return article;

    }

}