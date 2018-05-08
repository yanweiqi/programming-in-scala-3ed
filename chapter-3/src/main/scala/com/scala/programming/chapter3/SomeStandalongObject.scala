package com.scala.programming.chapter3

import scala.io.Source

/**
  * Created by yanweiqi on 2018/5/4.
  */
object SomeStandalongObject {

  val fileName = "/data/workspace/intellij/scala/programming-in-scala-3ed/chapter-3/src/main/scala/com/scala/programming/chapter3/Arrays.scala"

  def main(args: Array[String]): Unit = {
    def widthOfLength(s: String) = s.length.toString.length

    val lines = Source.fromFile(fileName).getLines().toList

    val longestLine = lines.reduceLeft((a, b) => {
      if (a.length > b.length) {
        //println("a="+a)
        a
      } else {
        //println("b="+b)
        b
      }

    })
    //println(longestLine)

    val maxWidth = widthOfLength(longestLine)
    //println(maxWidth)

    //println("-------------------------------pretty divider-------------------------------")

    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " * numSpaces
      println(padding + line.length + " | " + line)
    }

  }

}
