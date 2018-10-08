package info.adavis.model

data class Availability(
    var availableStock: Int? = null,
    var stockThreshold: Int? = null,
    var purchasable: Boolean,
    var availabilityState: String
)
