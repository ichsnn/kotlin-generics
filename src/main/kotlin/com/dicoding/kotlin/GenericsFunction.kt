package com.dicoding.kotlin

// fun <T> run() : T {
//   /*...*/
// }

// public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
//   /*...*/
// }

fun mainGenericsFunction() {
  val numbers1 = (1..100).toList()
  println(numbers1.slice<Int>(1..10))

  val numbers2 = (1..100).toList()
  println(numbers2.slice(1..10))
}