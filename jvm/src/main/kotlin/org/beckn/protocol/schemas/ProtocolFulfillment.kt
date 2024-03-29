package org.beckn.protocol.schemas

data class ProtocolFulfillment @Default constructor(
  val id: String? = null,
  val type: String? = null,//todo: is this a string or an enum?
  val state: ProtocolState? = null,
  val tracking: Boolean? = null,
  val agent: ProtocolPerson? = null,
  val person: ProtocolPerson? = null,
  val vehicle: ProtocolVehicle? = null,
  val start: ProtocolFulfillmentStart? = null,
  val end: ProtocolFulfillmentEnd? = null,
  val customer: ProtocolCustomer? = null,
  val tags: Map<String, String>? = null,
  val provider_id: String? = null,
  val rating: Int? = null
)

data class ProtocolCustomer @Default constructor(
  val person: ProtocolPerson? = null,
  val contact: ProtocolContact? = null
)

data class ProtocolState @Default constructor(
  val descriptor: ProtocolDescriptor? = null,
  val updatedAt: java.time.OffsetDateTime? = null,
  val updatedBy: String? = null
)

data class ProtocolPerson @Default constructor(
  val name: String? = null,
  val id: String? = null,
  val image: String? = null,
  val dob: java.time.LocalDate? = null,
  val gender: String? = null,
  val cred: String? = null,
  val tags: Map<String, String>? = null,
  val descriptor: ProtocolDescriptor? = null,

)

data class ProtocolVehicle @Default constructor(
  val category: String? = null,
  val capacity: Int? = null,
  val make: String? = null,
  val model: String? = null,
  val size: String? = null,
  val variant: String? = null,
  val color: String? = null,
  val energyType: String? = null,
  val registration: String? = null
)

// TODO Similar classes
data class ProtocolFulfillmentStart @Default constructor(
  val location: ProtocolLocation? = null,
  val time: ProtocolTime? = null,
  val instructions: ProtocolDescriptor? = null,
  val contact: ProtocolContact? = null
)

// TODO Similar classes
data class ProtocolFulfillmentEnd @Default constructor(
  val location: ProtocolLocation? = null,
  val time: ProtocolTime? = null,
  val instructions: ProtocolDescriptor? = null,
  val contact: ProtocolContact? = null
)


data class ProtocolContact @Default constructor(
  val phone: String? = null,
  val email: String? = null,
  val tags: Map<String, String>? = null
)