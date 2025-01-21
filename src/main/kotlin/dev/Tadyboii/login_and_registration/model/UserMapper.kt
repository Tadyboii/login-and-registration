package dev.Tadyboii.login_and_registration.model

import dev.Tadyboii.login_and_registration.table.user.UserProfile

fun UserProfile.toDTO() = UserDTO(
    id = id.value,
    username = username,
    password = password
)

fun UserDTO.createEntity() = UserProfile.new {
    val userDTO = this@createEntity
    username = userDTO.username
    password = userDTO.password
}
