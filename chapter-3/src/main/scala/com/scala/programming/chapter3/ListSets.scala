package com.scala.programming.chapter3

import scala.collection.mutable.ListBuffer

/**
  * Created by yanweiqi on 2018/5/8.
  */
object ListSets {

  /**
    * list has a method named ':::' for list concatenation
    *
    * @param l1
    * @param l2
    * @return
    */
  def listConcatenation(l1: List[Int], l2: List[Int]) = {
    l1 ::: l2
  }

  def nil(a: Int, b: Int, c: Int) = {
    a :: b :: c :: Nil
  }

  /**
    * Cons prepends a new element to the beginning of an existing list and returns the resulting list
    * x::list is equivalent to list.::(x)
    * @param l1
    * @param number
    * @return
    */
  def cons(l1: List[Int], number: Int) = {
    number :: l1;
  }


  def listBuffer(): Unit ={
    val list = List(1000)
    val newList = list ::: new ListBuffer() .:+ (10) .:+(20).toList
    val nn = newList.map(e => e * 10)
    nn.foreach(println)
  }

  def main(args: Array[String]): Unit = {

    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)

    println(listConcatenation(oneTwo, threeFour))
    println(cons(oneTwo, 0))
    println(nil(1, 2, 3))

    val emp = "q" :: "qq" :: Nil

    // :+ and +: the difference between the two,
    // 1) +: method header adds elements,
    // 2) :+ method
    val w = emp :+ "qqq"
    println(w)


  }
}
