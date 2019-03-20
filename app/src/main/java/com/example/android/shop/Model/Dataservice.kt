package com.example.android.shop.Model

object Dataservice {

        val category= listOf(
                Category("HATS","DEVSHATS"),
                Category("SHIRTS","DEVSSHIRTS"),
                Category("HOODIES","DEVSHOODIES"),
                Category("DIGITALGOODIES","DEVSDIGITALGOODIES")

        )

        val  hats= listOf(
            Product("beanie","$12","hat01"),
            Product("white","$15","hat02"),
            Product("black","$11","hat03"),
            Product("snapback","$11","hat04")


        )
        val shirts= listOf(
            Product("black","$12","hat01"),
            Product("grey","$15","hat02"),
            Product("red","$11","hat03"),
            Product("hustle","$11","hat04"),
            Product("studios","$11","hat04")


        )


        val hoodies= listOf(
            Product("gray","$12","hat01"),
            Product("red","$15","hat02"),
            Product("gray","$11","hat03"),
            Product("black","$11","hat04")
        )

    }
