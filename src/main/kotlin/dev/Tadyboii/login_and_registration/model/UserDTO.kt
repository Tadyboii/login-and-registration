package dev.Tadyboii.login_and_registration.model

import java.util.*

data class UserDTO(
    val id: UUID?,
    val username : String,
    val password: String
    )