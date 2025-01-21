package dev.Tadyboii.login_and_registration.table.user

import org.jetbrains.exposed.dao.id.UUIDTable

object UserProfiles: UUIDTable(name = "user_profile"){
    val username = text("name")
    val password = text("password")
}