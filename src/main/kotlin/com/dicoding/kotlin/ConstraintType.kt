package com.dicoding.kotlin

// class ListNumber<T : Number> : List<T>{
//   override fun get(index: Int): T {
//     /* .. */
//   }
// }

fun mainConstrainType() {
  // val numbers = ListNumber<Long>()
  // val numbers2 = ListNumber<Int>()
  // val numbers3 = ListNumber<String>() // error : Type argument is not within its bounds

  // val numbers = listOf(1, 2, 3, 4, 5)
  // numbers.sumNumber()
  // val names = listOf("dicoding", "academy")
  // names.sumNumber() // error : inferred type String is not a subtype of Number
}

// class ListNumber<T : Number> : List<T>{
//   override fun get(index: Int): T {
//     /* .. */
//   }
// }

// fun <T : Number> List<T>.sumNumber() : T {
//   /* .. */
// }