package info.adavis.model

data class Product(
    var _id: String,
    var name: String,
    var sku: String,
    var availability: Availability?
)
