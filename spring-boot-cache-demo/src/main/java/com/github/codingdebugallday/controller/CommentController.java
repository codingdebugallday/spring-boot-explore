package com.github.codingdebugallday.controller;

import com.github.codingdebugallday.pojo.Comment;
import com.github.codingdebugallday.service.CommentService;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/09/27 2:47
 * @since 1.0.0
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/{id}")
    public Comment findCommentById(@PathVariable Long id) {
        return commentService.findCommentById(id);
    }

    @PutMapping
    public Comment updateComment(@RequestBody Comment comment) {
        return commentService.updateComment(comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
    }

}
