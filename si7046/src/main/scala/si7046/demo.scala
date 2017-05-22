package si7046

import shapeless._

object Demo extends App {
  val gen = Generic[ADT]
  val foo: ADT = Ctor2("foo")
  assert(gen.to(foo) == Inr(Inl(Ctor2("foo"))))
}

sealed trait ADT
case class Ctor1(i: Int) extends ADT
case class Ctor2(s: String) extends ADT
