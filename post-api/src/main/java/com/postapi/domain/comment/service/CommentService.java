package com.postapi.domain.comment.service;

import com.postapi.domain.comment.dto.CommentResponse;
import com.postapi.domain.comment.dto.CreateCommentRequest;
import com.postapi.domain.comment.dto.UpdateCommentRequest;
import com.postapi.common.dto.PageResponse;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface CommentService {

    CommentResponse createComment(
            UUID postId,
            CreateCommentRequest request
    );

    PageResponse<CommentResponse> getPostComments(
            UUID postId,
            Pageable pageable
    );

    CommentResponse updateComment(
            UUID commentId,
            UpdateCommentRequest request
    );

    public void deleteComment(UUID commentId);

}
