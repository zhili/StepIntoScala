package test.scala

import org.specs._
import main.scala.Rational

class RationalSpec extends Specification {

    implicit def inToRational(x:Int) = new Rational(x)
    "Rational 1/2 + 2/3 equals to 7/6" in {
        val x = new Rational(1,2)
        val y = new Rational(2,3)
        (x+y).toString mustEqual "7/6"
    }
    "Rational 1/2 * 2/3 equals to 1/3" in {
        val x = new Rational(1,2)
        val y = new Rational(2,3)
        (x*y).toString mustEqual "1/3"
    }
    "Rational 1/2 * 2 equals to 1" in {
        val x = new Rational(1,2)
        (x*2).toString mustEqual "1/1"
    }
    "Rational 2 * 1/2 equals to 1" in {
        val x = new Rational(1,2)
        (2*x).toString mustEqual "1/1"
    }
}

// vim: set ts=4 sw=4 et:
