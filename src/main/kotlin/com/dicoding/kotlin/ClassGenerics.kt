package com.dicoding.kotlin

import java.lang.Error

interface List<T> {
  operator fun get(index: Int): T
}

class LongList : List<Long> {
  override fun get(index: Int): Long {
    return this[index]
  }
}

class ArrayList<T> : List<T> {
  override fun get(index: Int): T {
    return this[index]
  }
}

fun mainClassGenerics() {
  var longArrayList = ArrayList<Long>()
  try {
    val firstLong = longArrayList.get(0)
    println(firstLong)
  } catch (e: StackOverflowError) {
    println(e)
  }
}