package com.postapi.domain.post.mapper;

import com.postapi.domain.post.dto.PostResponse;
import com.postapi.domain.post.entity.Post;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PostMapper {

    @Mapping(
            target = "userId",
            source = "user.id"
    )
    @Mapping(
            target = "username",
            source = "user.username"
    )
    PostResponse toResponse(Post post);
}