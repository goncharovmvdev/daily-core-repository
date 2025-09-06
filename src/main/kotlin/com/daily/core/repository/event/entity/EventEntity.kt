package com.daily.core.repository.event.entity

import com.daily.core.repository.common.entity.CreatedAndUpdatedMetadata
import com.daily.core.repository.common.entity.Period

interface EventEntity {

    val id: String?
    val title: String?
    val description: String?
    val period: Period?
    val createdAndUpdatedMetadata: CreatedAndUpdatedMetadata?

    @Suppress("Unused")
    data class DataImpl(

        override val id: String? = null,
        override val title: String? = null,
        override val description: String? = null,
        override val period: Period? = null,
        override val createdAndUpdatedMetadata: CreatedAndUpdatedMetadata? = null,
    ) : EventEntity
}
