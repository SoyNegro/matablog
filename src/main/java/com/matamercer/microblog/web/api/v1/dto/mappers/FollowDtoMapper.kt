package com.matamercer.microblog.web.api.v1.dto.mappers

import com.matamercer.microblog.models.entities.Follow
import com.matamercer.microblog.web.api.v1.dto.responses.FollowResponseDto

fun Follow.toFollowResponseDto(): FollowResponseDto{
    val dto = toBaseModelResponseDto(FollowResponseDto())
    dto.follower = follower?.toBlogResponseDto()
    dto.followee = followee?.toBlogResponseDto()
    dto.notificationsEnabled = notificationsEnabled
    dto.muted = muted
    return dto
}