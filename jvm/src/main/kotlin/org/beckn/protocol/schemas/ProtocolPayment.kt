package org.beckn.protocol.schemas

import com.fasterxml.jackson.annotation.JsonProperty

data class ProtocolPayment @Default constructor(
  val uri: java.net.URI? = null,
  val tlMethod: TlMethod? = null,
  val params: Map<String, String>? = null,
  val type: Type? = null,
  val status: Status? = null,
  val time: ProtocolTime? = null
) {

  /**
   *
   * Values: get,post
   */
  enum class TlMethod(val value: String) {
    @JsonProperty("http/get")
    GET("http/get"),
    @JsonProperty("http/post")
    POST("http/post");
  }

  /**
   *
   * Values: oNMinusORDER,pREMinusFULFILLMENT,oNMinusFULFILLMENT,pOSTMinusFULFILLMENT
   */
  enum class Type(val value: String) {
    @JsonProperty("ON-ORDER")
    ONORDER("ON-ORDER"),
    @JsonProperty("PRE-FULFILLMENT")
    PREFULFILLMENT("PRE-FULFILLMENT"),
    @JsonProperty("ON-FULFILLMENT")
    ONFULFILLMENT("ON-FULFILLMENT"),
    @JsonProperty("POST-FULFILLMENT")
    POSTFULFILLMENT("POST-FULFILLMENT");
  }

  enum class Status(val value: String) {
    PAID("PAID"),
    @JsonProperty("NOT-PAID")
    NOTPAID("NOT-PAID");
  }
}
data class PaymentParams @Default constructor(
  val transaction_id: String? = null,
  val transaction_status: String? = null,
  val amount: String? = null,
  val currency: ProtocolPrice? = null,
)