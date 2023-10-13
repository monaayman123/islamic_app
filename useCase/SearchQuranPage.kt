package com.example.domain.useCase

import com.example.domain.reporisatory.QuranRepo

class SearchQuranPage(private val repo: QuranRepo) {
    suspend operator fun invoke(textSearch:String)=repo.searchQuran(textSearch)
}