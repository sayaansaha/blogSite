package com.sci.madman.repositories;

import com.sci.madman.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostRepositoryService implements PostRepository {
    private List<Post> posts = new ArrayList<>();
}
