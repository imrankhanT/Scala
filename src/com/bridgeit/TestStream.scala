package com.bridgeit

object TestStream {
  def main(args: Array[String]) {
    val stream = 100 #:: 200 #:: 85 #:: Stream.empty
    println(stream)
  }
}