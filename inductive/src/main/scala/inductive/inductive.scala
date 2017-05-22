package inductive

import shapeless._, ops.hlist._

object Demo {
  val l = 23 :: "foo" :: true :: HNil
  val b = l.select[Boolean]

  val i0 = Selector[Int :: String :: Boolean :: HNil, Boolean]
  val i1 = implicitly[Selector[Int :: String :: Boolean :: HNil, Boolean]]
}

@annotation.inductive
trait Selector[L <: HList, U] {
  def apply(l: L): U
}

object Selector {
  def apply[L <: HList, U](implicit selector: Selector[L, U]): Selector[L, U] = selector

  implicit def inHead[H, T <: HList]: Selector[H :: T, H] =
    new Selector[H :: T, H] {
      def apply(l : H :: T) = l.head
    }

  implicit def inTail[H, T <: HList, U]
    (implicit st : Selector[T, U]): Selector[H :: T, U] =
      new Selector[H :: T, U] {
        def apply(l : H :: T) = st(l.tail)
      }
}
