package com.dicoding.kotlin

abstract class Vehicle(var wheel: Int)
class Car(var speed: Int) : Vehicle(4)
class MotorCycle(var speed: Int) : Vehicle(2)

// Covariant
interface List2<out E> : Collection<E> {
  operator fun get(index: Int): E
}

// Contravariant
interface Comparable<in T> {
  operator fun compareTo(other: T): Int
}

fun mainVariance() {
  val car = Car(200)
  val motorCycle = MotorCycle(100)
  var vehicle: Vehicle = car
  vehicle = motorCycle
  println(vehicle.wheel)

  val carList = listOf(Car(100), Car(120))
  val vehicleList = carList
  vehicleList.forEach {
    println("Wheel: ${it.wheel}; Speed: ${it.speed}")
  }
}