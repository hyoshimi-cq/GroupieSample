package com.hiromu.groupiesample

data class Fruit(
    val title: String
) {
    companion object {
        fun all(): List<Fruit> {
            return listOf(
                Fruit("lemon"),
                Fruit("strawberry"),
                Fruit("peach"),
                Fruit("melon"),
                Fruit("apple"),
                Fruit("banana"),
                Fruit("grape"),
                Fruit("cherry"),
                Fruit("orange"),
                Fruit("pear"),
                Fruit("plum"),
                Fruit("pineapple")
            )
        }
    }
}
