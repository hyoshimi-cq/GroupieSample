package com.hiromu.groupiesample

data class Fruit(
    val title: String,
    val bgColor: Int
) {
    companion object {
        fun all(): List<Fruit> {
            return listOf(
                Fruit("lemon", android.R.color.holo_orange_light),
                Fruit("strawberry", android.R.color.holo_red_dark),
                Fruit("peach", android.R.color.holo_purple),
                Fruit("melon", android.R.color.holo_green_dark),
                Fruit("apple", android.R.color.holo_red_light),
                Fruit("banana", android.R.color.holo_orange_light),
                Fruit("grape", android.R.color.holo_blue_dark),
                Fruit("cherry", android.R.color.holo_red_dark),
                Fruit("orange", android.R.color.holo_orange_dark),
                Fruit("pear", android.R.color.holo_green_light),
                Fruit("plum", android.R.color.holo_red_dark),
                Fruit("pineapple", android.R.color.holo_orange_dark)
            )
        }
    }
}
