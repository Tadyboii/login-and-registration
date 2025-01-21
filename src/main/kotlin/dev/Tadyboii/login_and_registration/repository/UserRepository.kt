package dev.Tadyboii.login_and_registration.repository

import dev.Tadyboii.login_and_registration.model.UserDTO
import dev.Tadyboii.login_and_registration.model.createEntity
import dev.Tadyboii.login_and_registration.model.toDTO
import dev.Tadyboii.login_and_registration.table.user.UserProfile
import dev.Tadyboii.login_and_registration.table.user.UserProfiles
import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.stereotype.Repository

@Repository
class UserRepository {

    fun getUsers(): List<UserDTO> {
        return transaction {
            UserProfile.all().map { it.toDTO() }
        }
    }

    fun createUser(userDTO: UserDTO): UserDTO? {
        return transaction {
            if (UserProfile.find { UserProfiles.username eq userDTO.username }.empty()) {
                val user = userDTO.createEntity()
                user.toDTO()
            } else {
                null
            }
        }
    }

    fun getUserByUsername(username: String): UserDTO? {
        return transaction {
            UserProfile.find { UserProfiles.username eq username }.firstOrNull()?.toDTO()
        }
    }
}