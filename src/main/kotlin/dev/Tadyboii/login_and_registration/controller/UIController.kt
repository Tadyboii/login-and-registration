package dev.Tadyboii.login_and_registration.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UIController {

    @GetMapping("/login")
    fun login(): String {
        return "login"
    }

    @GetMapping("/signup")
    fun signup(): String {
        return "signup"
    }

    @GetMapping("/home")
    fun home(): String {
        return "home"
    }
}

