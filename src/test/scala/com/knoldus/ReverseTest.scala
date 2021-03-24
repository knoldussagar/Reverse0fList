package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

import scala.Console.in

class ReverseTest extends AnyFlatSpec with Matchers {

  val reverse = new Reverse

  "A reverse of list " should "return correctly after reversing reverse  " in {
    assert(reverse.reverseList(List(5, 6, 8)) == List(8, 6, 5))
  }

  "Reverse of empty list" should "return empty list " in {
    assert(reverse.reverseList(List()) == List())
  }

  "Reverse of list having different data type values  " should "return reverse of list correctly   " in {
    assert(reverse.reverseList(List(8, "Sagar", 5)) == List(5, "Sagar", 8))
  }


  // scalastyle:off magic.number


  // negative test case for reverseList method
  "Reverse of list   " should "not be incorrect  " in {
    assert(reverse.reverseList(List("56", 37, "65")) != List(37, "65", "56"))
  }


  "reverse of empty string " should "return empty string " in {
    assert(reverse.reverseString("") == "")
  }


  "reverse of a string " should "return reverse value " in {
    assert(reverse.reverseString("Goel") == "loeG")
  }

  // negative test case for reverseString method
  "reverse of a string " should "not incorrect " in {
    assert(reverse.reverseString("Sagar") != "ragaS")
  }

}

