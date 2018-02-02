package com.bridgeit

import scala.collection.immutable._
object TestListSet {
  def main(args: Array[String]) {

    var listset: ListSet[String] = new ListSet()
    var listset1: ListSet[String] = ListSet.empty

    println(listset)

    println(listset1)

    listset += "india"
    listset += "South Africa"
    listset += "india"

    listset1 += "delhi"
    listset1 += "Cape Town"
    listset1 += "delhi"

    println("After Adding A New Elements................")

    println(listset)

    println(listset1)
  }
}