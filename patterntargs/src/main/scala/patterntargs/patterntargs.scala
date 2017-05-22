package patterntargs

import scala.reflect.ClassTag

import shapeless._

object TypeCase {
  import syntax.typeable._
  def unapply[T: Typeable](t: Any): Option[T] = t.cast[T]
}

object Demo {
  def unsafeMatch(x: Any): List[Int] = x match {
    case xs: List[Int] => xs
    case _ => Nil
  }

  def safeMatch(x: Any): List[Int] = x match {
    case TypeCase[List[Int]](xs) => xs
    case _ => Nil
  }

  def unsafeMatch2[T: ClassTag](x: Any): Option[T] = x match {
    case t: T => Some(t)
    case _ => None
  }
}
