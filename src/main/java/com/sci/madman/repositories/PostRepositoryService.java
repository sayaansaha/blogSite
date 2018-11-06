package com.sci.madman.repositories;

import com.sci.madman.models.Post;
import com.sci.madman.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PostRepositoryService implements PostRepository {
    private List<Post> posts = new ArrayList<>() {{
        add(new Post(1L, "First Post", "<p>Line #1.</p><p>Line #2</p>",
                new User(10L, "pesho10", "Peter Ivanov")));

    }};


    @Override
    public List<Post> findAll() {
        return this.posts;
    }

    @Override
    public Optional<Post> findById(Long id) {
        return return Optional.ofNullable(this.posts.stream()
                .filter(p -> Objects.equals(p.getId(), id))
                .findFirst()
                .orElse(null));
    }

    @Override
    public Post create(Post post) {
        post.setId(this.posts.stream().mapToLong(
                p -> p.getId()).max().getAsLong() + 1);
        this.posts.add(post);
        return post;
    }

    @Override
    public Post edit(Post post) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
