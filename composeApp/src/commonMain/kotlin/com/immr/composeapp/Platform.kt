package com.immr.composeapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform