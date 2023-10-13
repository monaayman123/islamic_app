package com.example.domain.useCase

import com.example.domain.reporisatory.QuranRepo

class GetJozaNumber( private  val repo: QuranRepo) {
    suspend  operator fun invoke(numberJoza:Int)=repo.getJoza(numberJoza)
}