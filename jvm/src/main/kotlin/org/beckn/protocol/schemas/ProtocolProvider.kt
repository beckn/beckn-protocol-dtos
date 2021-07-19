package org.beckn.protocol.schemas

data class ProtocolProvider @Default constructor(
    val id: String? = null,
    val descriptor: ProtocolDescriptor? = null,
    val time: ProtocolTime? = null,
    val locations: List<ProtocolLocation>? = null,
    val tags: Map<String, String>? = null
)