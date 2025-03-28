package cit.app.recyclerview.data

import cit.app.recyclerview.R

data class Employee(
    var id: String = "",
    var firstname: String = "",
    var middlename: String = "",
    var lastname: String = "",
    var photo: Int = R.drawable.android
)
