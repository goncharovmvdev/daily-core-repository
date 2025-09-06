package com.daily.core.repository.event

import com.daily.core.repository.common.entity.Period
import com.daily.core.repository.event.entity.EventEntity

@Suppress("Unused")
interface EventRepository {

    fun save(
        entity: EventEntity,
    ): EventEntity

    fun findAllByCreatedByEqAndPeriodIn(
        createdBy: String,
        wrapperPeriod: Period,
    ): List<EventEntity>

    fun findAllByCreatedByInAndPeriodIn(
        createdBy: Set<String>,
        wrapperPeriod: Period,
    ): List<EventEntity>
}
