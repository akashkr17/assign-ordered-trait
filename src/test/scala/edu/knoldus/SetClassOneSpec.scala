package edu.knoldus

import org.scalatest.funsuite.AnyFunSuite
import collection.immutable.Set

class SetClassOneSpec extends AnyFunSuite {

  test("Set does not contain the element") {
    val set1 = new SetClassOne[IntSet].incl(IntSet(1)).incl(IntSet(4))
    assert(!set1.contains(IntSet(7)))
  }

 test("Set contain the inserted element") {
   val set1 = new SetClassOne[IntSet].incl(IntSet(1)).incl(IntSet(4))
  assert(set1.contains(IntSet(4)))
  }

  test("Empty set does not contain any element") {
    val set1 = new SetClassOne[IntSet]
    assert(!set1.contains(IntSet(7)))
  }

}
