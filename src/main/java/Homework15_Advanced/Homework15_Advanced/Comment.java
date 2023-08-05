package Homework15_Advanced.Homework15_Advanced;

public class Comment {
    private int id;
    private String authorName;

    public Comment(int id, String authorName) {
        this.id = id;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }
}
