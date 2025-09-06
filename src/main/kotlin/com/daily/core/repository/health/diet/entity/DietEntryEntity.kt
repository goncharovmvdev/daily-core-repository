package com.daily.core.repository.health.diet.entity

import com.daily.core.repository.common.entity.CreatedAndUpdatedMetadata

interface DietEntryEntity {

    val id: String?
    val startTime: Long?
    val endTime: Long?
    val value: String?
    val createdAndUpdatedMetadata: CreatedAndUpdatedMetadata?

    data class DataImpl(

        override val id: String? = null,
        override val startTime: Long? = null,
        override val endTime: Long? = null,
        override val value: String? = null,
        override val createdAndUpdatedMetadata: CreatedAndUpdatedMetadata? = null,
    ) : DietEntryEntity
}
