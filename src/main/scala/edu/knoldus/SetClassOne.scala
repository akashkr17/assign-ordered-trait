package edu.knoldus

class SetClassOne[A <: Ordered[A]] extends Set[A] {
  def contains(x: A): Boolean = false
  def incl(x: A): Set[A] = new SetClassTwo(x, new  SetClassOne[A], new SetClassOne[A])
}



