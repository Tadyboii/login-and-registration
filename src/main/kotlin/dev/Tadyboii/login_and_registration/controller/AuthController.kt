package dev.Tadyboii.login_and_registration.controller

import dev.Tadyboii.login_and_registration.model.UserDTO
import dev.Tadyboii.login_and_registration.service.UserService
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthController(
    private val userService: UserService,
    private val passwordEncoder: PasswordEncoder
) {
    @PostMapping("/signup")
    fun signup(@ModelAttribute userDTO: UserDTO): UserDTO? {
        val password = passwordEncoder.encode(userDTO.password)
        return userService.createUser(userDTO.copy(password = password))
    }
}

