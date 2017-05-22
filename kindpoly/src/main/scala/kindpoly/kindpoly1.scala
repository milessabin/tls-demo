package kindpoly

object Demo1 extends App {

  case class ShowType[T](val show: String)
  object ShowType {
    def apply[T](implicit st: ShowType[T]) = st
    
    implicit def showInt = ShowType[Int]("Int")
    implicit def showString = ShowType[String]("String")
  }

  assert(ShowType[Int].show == "Int")
  assert(ShowType[String].show == "String")
}
