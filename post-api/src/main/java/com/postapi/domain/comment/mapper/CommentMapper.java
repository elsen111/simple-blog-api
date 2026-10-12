package com.postapi.domain.comment.mapper;

import com.postapi.domain.comment.dto.CommentResponse;
import com.postapi.domain.comment.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    @Mapping(
            target = "postId",
            source = "post.id"
    )
    @Mapping(
            target = "userId",
            source = "user.id"
    )
    @Mapping(
            target = "username",
            source = "user.username"
    )
    CommentResponse toResponse(Comment comment);
}