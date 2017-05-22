// Compiled with ./build/pack/bin/scalac -J-Xss4M -J-Xmx2G test/files/pos/inductive-implicits.scala
//
// 1: baseline - scalac 2.12.x
// 2: + -Yinduction-heuristics
//
//              (1)   (2)
// HList Size
//  50           4     3
// 100          10     3
// 150          19     4
// 200          38     5
// 250          66     5
// 300          98     6
// 350         155     7
// 400         218     8
// 450         238     9
// 500         438    12
//
//            Compile time in seconds

import shapeless._, ops.hlist._

object Test extends App {
  val sel = Selector[L, Boolean]

  type L =
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
    Int ::
//
    Boolean ::
    HNil
}
