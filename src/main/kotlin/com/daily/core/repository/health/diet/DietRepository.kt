package com.daily.core.repository.health.diet

import com.daily.core.repository.health.diet.entity.DietEntryEntity

interface DietRepository {

    fun save(
        entity: DietEntryEntity,
    ): DietEntryEntity
}
