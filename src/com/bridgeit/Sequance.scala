package com.bridgeit

object Sequance {
  def main(args: Array[String]) {
    var seq: Seq[Int] = Seq(10, 20, 30, 40, 50)

    seq.foreach((elements: Int) => println(elements))

    println("Accessing A Element Using Index.........." + seq(2))
    println("Contains-------->" + seq.contains(20))
    println("Contains-------->" + seq.contains(100))
    println("Last Index------>" + seq.lastIndexOf(20))
    println("Reversing a Elements---->" + seq.reverse)
    println("Ends With--->" + seq.endsWith(Seq(40, 50)))
  }
}