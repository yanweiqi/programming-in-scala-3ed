package com.scala.programming.chapter2

/**
  * Created by yanweiqi on 2018/5/4.
  */
object Printargs {


  def main(args: Array[String]): Unit = {

    var myArray = Array("scala", "is", "fun")

    var i = 0

    while (i < myArray.length) {
      println(myArray(i))
      i += 1;
    }
    println("-----------------pretty divider-------------------------------")

    /**
      *
      */
    myArray.foreach(a => println(a))

    println("-----------------pretty divider-------------------------------")

    myArray.foreach(println);

    println("-----------------pretty divider-------------------------------")

    val greetArray = new Array[String](3);
    greetArray(0) = "a"
    greetArray(1) = "b"
    greetArray(2) = "c"
    //greetArray(3) = "d"
    greetArray.foreach(println);

    println("-----------------pretty divider-------------------------------")
    for(i <- 0 to 2)println(greetArray(i));
  }

}
