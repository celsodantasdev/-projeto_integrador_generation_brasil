package com.generation.projetointegrador2.model

data class Tema(
    val id: Int,
    var descricao: String,
    var postagem: Postagem
) {
}