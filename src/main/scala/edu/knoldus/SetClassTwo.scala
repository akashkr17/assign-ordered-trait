package edu.knoldus


class SetClassTwo[A <: Ordered[A]] (element: A, left: Set[A],right: Set[A]) extends Set[A] {
  def contains(x: A) : Boolean =  x match {
    case a   if a < element => left.contains(a)
    case b if b > element => right.contains(b)
    case _ => true
  }

  def incl(x: A): Set[A] = x match {
    case a  if a < element => new SetClassTwo(element, left.incl(a), right)
    case b if b > element => new SetClassTwo(element, left, right.incl(b))
    case _ => this
  }
}

case class IntSet(x: Int) extends Ordered[IntSet] {
  def compare(that:IntSet): Int =
    if (this.x < that.x) -1
    else if (this.x > that.x) 1
    else 0
}