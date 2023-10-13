package com.example.domain.useCase

import com.example.domain.reporisatory.QuranRepo

class ReadQuranPackageUseCase(private val repo: QuranRepo) {
     suspend operator fun invoke(numberPage:Int)=repo.getQuranPage(numberPage)
}