package com.multiform.androidhandbook.ui

import android.content.SearchRecentSuggestionsProvider

class SearchProvider: SearchRecentSuggestionsProvider() {
    companion object {
        const val AUTHORITY = "com.multiform.SearchProvider"
        const val MODE = DATABASE_MODE_QUERIES
    }

    init {
        setupSuggestions(AUTHORITY, MODE)
    }
}