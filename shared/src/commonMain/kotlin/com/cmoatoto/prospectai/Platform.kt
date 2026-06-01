package com.cmoatoto.prospectai

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
