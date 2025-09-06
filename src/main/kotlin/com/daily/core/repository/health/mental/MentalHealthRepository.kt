package com.daily.core.repository.health.mental

import com.daily.core.repository.health.mental.entity.MentalHealthEntryEntity

interface MentalHealthRepository {

    fun save(
        entity: MentalHealthEntryEntity,
    ): MentalHealthEntryEntity
}
