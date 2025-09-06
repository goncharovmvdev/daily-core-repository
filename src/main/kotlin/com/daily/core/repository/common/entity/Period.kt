package com.daily.core.repository.common.entity

interface Period {

    val from: Long?
    val to: Long?

    data class DataImpl(

        override val from: Long? = null,
        override val to: Long? = null,
    ) : Period
}
