package com.bridgeit

import scala.collection.immutable._

object TestQueue {
  def main(args: Array[String]) {
    var queue = Queue(12, 23, 45, 3, 56, 78)

    println("Front Element is.........." + queue.front);

    var newQueue = queue.enqueue(100);

    newQueue.foreach((elements: Int) => println(elements + " "))

    println("Deleted Element is....." + newQueue.dequeue)

    println("Last Element is......." + newQueue.last)
  }
}