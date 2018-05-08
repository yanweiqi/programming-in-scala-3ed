package com.scala.programming.chapter2


object Steps {

  def main(args: Array[String]): Unit = {

    val a = 1 + 2

    println(a)
    println("a = 1 + 2 class [" + a.getClass + "]")
    println("a * 3 =" + a * 3)


    /**
      *
      * 1) define some variables,scala has two kinds of variables,val and var,
      * 2) A val is similar to a final variable in Java,Once initialized a val can never be reassigned.
      * 3) A val,by contrast,is similar to non-final variable in Java,A var can be reassigned throughout its lifetime.
      * Here's v val definition
      */
    println("-----------------pretty divider-------------------------------")
    val msg = "Hi weiqi.yan"

    println(msg)

    var greeting = "Hello,world"
    println(greeting)
    greeting = "Leave me alone,world"
    println(greeting)
    println("-----------------pretty divider-------------------------------")


    println(max(3, 4))
    greet()

  }

  /**
    *
    * @param x
    * @param y
    * @return
    */
  def max(x: Int, y: Int): Int = {
    if (x > y) x else y
  }

  def greet(): Unit = {
    println("no return")
  }


}