package com.example.urvish.enumclassesdemo

enum class Months {
    January {
        override fun printData() {
            println("First Month of Year")
        }
    },
    February {
        override fun printData() {
            println("Second Month of Year")
        }
    },
    March {
        override fun printData() {
            println("Third Month of Year")
        }
    },
    April {
        override fun printData() {
            println("Forth Month of Year")
        }
    },
    May {
        override fun printData() {
            println("Fifth Month of Year")
        }
    },
    June {
        override fun printData() {
            println("Sixth Month of Year")
        }
    },
    July {
        override fun printData() {
            println("Seventh Month of Year")
        }
    },
    August {
        override fun printData() {
            println("Eighth Month of Year")
        }
    },
    September {
        override fun printData() {
            println("Ninth Month of Year")
        }
    },
    October {
        override fun printData() {
            println("Tenth Month of Year")
        }
    },
    November {
        override fun printData() {
            println("Eleventh Month of Year")
        }
    },
    December {
        override fun printData() {
            println("Twelfth Month of Year")
        }
    };

    abstract fun printData()
}