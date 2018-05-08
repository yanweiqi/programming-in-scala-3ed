package com.scala.programming.chapter1

import java.math.BigInteger

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by yanweiqi on 2018/5/4.
  */
class CountriesMapSpec extends FlatSpec with Matchers {


}

object AppTest {

  def factorial(x: BigInteger): BigInteger ={
    if (x == BigInteger.ZERO) BigInteger.ONE else x.multiply(factorial(x.subtract(BigInteger.ONE)))
  }

  var capital = Map("US" -> "Washington", "France" -> "Paris")

  def addCapital(k: String, v: String): Unit = {
    capital += (k -> v)
  }

  def main(args: Array[String]): Unit = {

    println(factorial(BigInteger.valueOf(20)))

    addCapital("Japan", "Tokyo");

    capital.keys.foreach(i => {
      println("key=" + i + ",value=" + capital(i));
    })
  }


}