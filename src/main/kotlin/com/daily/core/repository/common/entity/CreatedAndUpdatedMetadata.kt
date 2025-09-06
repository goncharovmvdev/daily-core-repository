package com.daily.core.repository.common.entity

interface CreatedAndUpdatedMetadata {

    val createdBy: String?
    val updatedBy: String?
    val createdAt: Long?
    val updatedAt: Long?

    @Suppress("Unused")
    data class DataImpl(

        override val createdBy: String? = null,
        override val updatedBy: String? = null,
        override val createdAt: Long? = null,
        override val updatedAt: Long? = null,
    ): CreatedAndUpdatedMetadata
}
