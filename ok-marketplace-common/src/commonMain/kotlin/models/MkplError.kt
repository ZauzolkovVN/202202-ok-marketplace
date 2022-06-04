package ru.otus.otuskotlin.marketplace.common.models

data class MkplError(
    val code: String = "",
    val group: String = "",
    val field: String = "",
    val message: String = "",
    val level: MkplErrorLevels = MkplErrorLevels.ERROR,
    val exception: Throwable? = null,
)
