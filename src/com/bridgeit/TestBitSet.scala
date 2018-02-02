package com.bridgeit

import scala.collection.BitSet

object TestBitSet {
  def main(args: Array[String]) {

    var bitset = BitSet(12, 1, 23, 45, 12)

    bitset.foreach((elements: Int) => println(elements))

    bitset += 20

    print("After Adding Elements Are : ");

    bitset.foreach((elements: Int) => print(elements + " "))

    bitset -= 20

    println()

    print("After Removing An Elements : ")

    bitset.foreach((elements: Int) => print(elements + " "))
  }
}