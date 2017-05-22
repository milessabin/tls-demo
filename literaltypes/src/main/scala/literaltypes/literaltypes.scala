package literaltypes

import shapeless._, labelled._, record._, syntax.singleton._

object Demo {
  val r =
    ("name"  ->> "Alfred Tarski") ::
    ("title" ->> "Truth and Proof") ::
    ("date"  ->> 1969) ::
    HNil

  /*
  type ->>[K, V] = FieldType[K, V]

  type R =
    ("name"  ->> String) ::
    ("title" ->> String) ::
    ("date"  ->> Int) ::
    HNil

  r: R
  */
}
