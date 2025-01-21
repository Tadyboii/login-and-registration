package dev.Tadyboii.login_and_registration.table.user

import org.jetbrains.exposed.dao.UUIDEntity
import org.jetbrains.exposed.dao.UUIDEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import java.util.*

class UserProfile(id: EntityID<UUID>) : UUIDEntity(id) {
    companion object : UUIDEntityClass<UserProfile>(UserProfiles)

    var username by UserProfiles.username
    var password by UserProfiles.password
}