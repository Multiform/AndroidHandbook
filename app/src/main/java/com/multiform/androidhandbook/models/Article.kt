package com.multiform.androidhandbook.models

data class Article (
    val id: Int,
    var title: String,
    var text: String,
    var images: List<Int>,
    var links: List<String>
)