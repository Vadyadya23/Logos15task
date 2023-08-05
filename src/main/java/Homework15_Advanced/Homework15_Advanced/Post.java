package Homework15_Advanced.Homework15_Advanced;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.events.Comment;

public class Post {
    private int id;
    private String title;
    private List<Comment> comments;

    public Post(int id, String title) {
        this.id = id;
        this.title = title;
        this.comments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Homework15_Advanced.Homework15_Advanced.Comment comment) {
        comments.add((Comment) comment);
    }
}

