package dev.Tadyboii.login_and_registration.service

import dev.Tadyboii.login_and_registration.repository.UserRepository
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class CustomUserDetailService(
    private val userRepository: UserRepository
): UserDetailsService {

    override fun loadUserByUsername(username: String): UserDetails {
        val user = userRepository.getUserByUsername(username)
        if (user != null) {
            return User(
                user.username,
                user.password,
                emptyList()
            )
        }
            throw UsernameNotFoundException("User not found")
        }
    }

