package dev.Tadyboii.login_and_registration.service

import dev.Tadyboii.login_and_registration.model.UserDTO
import dev.Tadyboii.login_and_registration.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService (private val userRepository: UserRepository) {
    fun getUsers(): List<UserDTO> {
        return userRepository.getUsers()
    }

    fun createUser(userDTO: UserDTO): UserDTO? {
        return userRepository.createUser(userDTO)
    }
}