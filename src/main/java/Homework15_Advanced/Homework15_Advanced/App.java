package Homework15_Advanced.Homework15_Advanced;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List<Post> posts;

    public App() {
        this.posts = new ArrayList<>();
    }

    public void createPost(int id, String title) {
        Post post = new Post(id, title);
        posts.add(post);
    }

    public void createComment(int postId, int commentId, String authorName) {
        Post post = findPostById(postId);
        if (post != null) {
            Comment comment = new Comment(commentId, authorName);
            post.addComment(comment);
        }
    }

    public List<Post> getAllPosts() {
        return posts;
    }

    private Post findPostById(int postId) {
        for (Post post : posts) {
            if (post.getId() == postId) {
                return post;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        App app = new App();

        app.createPost(1, "First Post");
        app.createPost(2, "Second Post");

        app.createComment(1, 101, "User1");
        app.createComment(1, 102, "User2");
        app.createComment(2, 201, "User3");

        // Виведемо всі пости та їх коментарі
        for (Post post : app.getAllPosts()) {
            System.out.println("Post ID: " + post.getId() + ", Title: " + post.getTitle());
            for (javax.xml.stream.events.Comment comment : post.getComments()) {
                System.out.println("  Comment ID: " + ((Post) comment).getId() + ", Author: " + ((Comment) comment).getAuthorName());
            }
        }
    }
}

