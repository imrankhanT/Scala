package com.bridgeit

import scala.collection.mutable.HashSet

object TestHashSet {
  def main(args: Array[String]) {
    var hashset = HashSet(4, 2, 8, 0, 6, 3, 45)
    hashset.foreach((elements: Int) => println(elements + " "))
  }
}