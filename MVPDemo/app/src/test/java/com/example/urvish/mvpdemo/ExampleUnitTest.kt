package com.example.urvish.mvpdemo

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    private var mainPresenterImpl: PresenterImpl? = null
    private var MainView: MainView? = null
    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        assertEquals(3, (2 + 2).toLong())
    }

    @Test
    fun checkGravitationalForce() {
        assertEquals(3.6E22, MainActivity.GravitationalForce.gravitationalForce(2E30, 6E24, 1.5E11), (0).toDouble())
    }

    @Test
    fun checkFalseGravitationalForce() {
        assertNotEquals(3.6E2, MainActivity.GravitationalForce.gravitationalForce(2E30, 6E24, 1.5E11), (0).toDouble())
    }


}