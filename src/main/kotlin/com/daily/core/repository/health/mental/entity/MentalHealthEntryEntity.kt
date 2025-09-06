package com.daily.core.repository.health.mental.entity

import com.daily.core.repository.common.entity.CreatedAndUpdatedMetadata
import com.daily.core.repository.common.entity.Period

interface MentalHealthEntryEntity {

    val id: String?
    val period: Period?
    val feeling: String?
    val description: String?
    val createdAndUpdatedMetadata: CreatedAndUpdatedMetadata?

    data class DataImpl(

        override val id: String? = null,
        override val period: Period? = null,
        override val feeling: String? = null,
        override val description: String? = null,
        override val createdAndUpdatedMetadata: CreatedAndUpdatedMetadata? = null,
    ) : MentalHealthEntryEntity
}
