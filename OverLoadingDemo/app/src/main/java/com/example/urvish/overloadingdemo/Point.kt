package com.example.urvish.overloadingdemo

public class Point(val x: Int, val y: Int) {
    operator fun plus(next: Point): Point {
        return Point(x + next.x, y + next.y)
    }

    operator fun minus(next: Point): Point {
        return Point(x - next.x, y - next.y)
    }

    operator fun times(next: Point): Point {
        return Point(x * next.x, y * next.y)
    }

    operator fun div(next: Point): Point {
        if (next.x != 0 && next.y != 0) {
            return Point(x / next.x, y / next.y)
        }
        return Point(0, 0)
    }
}