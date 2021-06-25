package com.amolsoftwares.retrofitroom.model

data class VehiclesDataModel(
    val Count: Int,
    val Message: String,
    val Results: List<Result>,
    val SearchCriteria: String
)

data class Result(
    val CoverLetterURL: String,
    val LetterDate: String,
    val ManufacturerId: Int,
    val ManufacturerName: String,
    val ModelYearFrom: Int,
    val ModelYearTo: Any,
    val Name: String,
    val Type: String,
    val URL: String
)