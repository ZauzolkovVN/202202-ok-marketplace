package ru.otus.otuskotlin.marketplace.backend.services

import ru.otus.otuskotlin.marketplace.biz.MkplAdProcessor
import ru.otus.otuskotlin.marketplace.common.MkplContext
import ru.otus.otuskotlin.marketplace.common.exceptions.UnknownMkplCommand
import ru.otus.otuskotlin.marketplace.common.models.*
import ru.otus.otuskotlin.marketplace.common.stubs.MkplStubs

class AdService {
    private val processor = MkplAdProcessor()

    suspend fun exec(context: MkplContext) = processor.exec(context)

    suspend fun createAd(context: MkplContext) = processor.exec(context)
    suspend fun readAd(context: MkplContext) = processor.exec(context)
    suspend fun updateAd(context: MkplContext) = processor.exec(context)
    suspend fun deleteAd(context: MkplContext) = processor.exec(context)
    suspend fun searchAd(context: MkplContext) = processor.exec(context)
    suspend fun searchOffers(context: MkplContext) = processor.exec(context)
}
