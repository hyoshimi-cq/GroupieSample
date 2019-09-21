package com.hiromu.groupiesample

data class Drink(
    val title: String
) {
    companion object {
        fun all(): List<Drink> {
            return listOf(
                Drink("tea"),
                Drink("green tea"),
                Drink("oolong tea"),
                Drink("hot chocolate"),
                Drink("coffee"),
                Drink("water"),
                Drink("coke"),
                Drink("cider"),
                Drink("whiskey"),
                Drink("sake"),
                Drink("plum liquor"),
                Drink("makkoli"),
                Drink("wine")
            )
        }
    }
}
