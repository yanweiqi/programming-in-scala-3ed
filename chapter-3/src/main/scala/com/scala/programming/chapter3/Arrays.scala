package com.scala.programming.chapter3

import java.math.BigInteger

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by yanweiqi on 2018/5/4.
  */


object Arrays {

  def main(args: Array[String]): Unit = {

    //val greetString = new Array[String](3)
    // the same
    val greetString: Array[String] = new Array[String](3)
    greetString(0) = "Hello"
    // the same
    greetString.update(0,"Hello")
    greetString(1) = ", "
    greetString(2) = "world! \n"

    for (i<- 0 to 2){
      println(greetString(i))
    }
    println("-------------------------------pretty divider-------------------------------")
    // the same to
    for (i<- 0 to (2)) println(greetString.apply(i))

    println("-------------------------------pretty divider-------------------------------")

    Console.print(10)
    // the same


  }


}