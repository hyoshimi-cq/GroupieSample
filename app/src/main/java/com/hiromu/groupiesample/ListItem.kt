package com.hiromu.groupiesample

data class ListItem(
    val title: String,
    val bgColor: Int
) {
    companion object {
        fun all(): List<ListItem> {
            return listOf(
                ListItem("lemon", android.R.color.holo_orange_light),
                ListItem("strawberry", android.R.color.holo_red_dark),
                ListItem("peach", android.R.color.holo_purple),
                ListItem("melon", android.R.color.holo_green_dark),
                ListItem("apple", android.R.color.holo_red_light),
                ListItem("banana", android.R.color.holo_orange_light),
                ListItem("grape", android.R.color.holo_blue_dark),
                ListItem("cherry", android.R.color.holo_red_dark),
                ListItem("orange", android.R.color.holo_orange_dark),
                ListItem("pear", android.R.color.holo_green_light),
                ListItem("plum", android.R.color.holo_red_dark),
                ListItem("pineapple", android.R.color.holo_orange_dark)
            )
        }
    }
}
