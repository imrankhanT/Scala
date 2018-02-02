package com.bridgeit

object TestVector {
  def main(args: Array[String]) {
    var vector1 = Vector("India", "Australia", "England")

    var vector2 = Vector("delhi", "Sydney", "Bermingham")

    var newVector = vector1 ++ vector2;

    newVector.foreach((elements: String) => println(elements + " "))

    println("Reversing A Merge Elements----->" + newVector.reverse)

    println("Sorted Elements------>" + newVector.sorted)
  }
}