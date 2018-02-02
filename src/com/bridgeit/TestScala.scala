package com.bridgeit

import scala.collection.immutable._

object TestScala {
  def main(args: Array[String]) {
    var hashset = HashSet(12, 13, 1, 14, 12)

    println("HashSet Elements Are--> " + hashset.toString())

    println("Head Element is---->" + hashset.head)

    println("Tail Element is---->" + hashset.tail)

    hashset.foreach((elements: Int) => println(elements + " "))
  }
}