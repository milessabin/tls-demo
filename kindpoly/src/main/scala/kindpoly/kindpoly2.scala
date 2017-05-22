package kindpoly

object Demo2 extends App {

  case class ShowType[T](val show: String)
  object ShowType {
    def apply[T](implicit st: ShowType[T]) = st
    
    implicit def showInt = ShowType[Int]("Int")
    implicit def showString = ShowType[String]("String")

    implicit def showOption[A]
			(implicit sta: ShowType[A]) = ShowType[Option[A]](s"Option[${sta.show}]")

    implicit def showList[A]
			(implicit sta: ShowType[A]) = ShowType[List[A]](s"List[${sta.show}]")

    implicit def showVector[A]
			(implicit sta: ShowType[A]) = ShowType[Vector[A]](s"Vector[${sta.show}]")

    implicit def showSet[A]
			(implicit sta: ShowType[A]) = ShowType[Set[A]](s"Set[${sta.show}]")
  }

  assert(ShowType[Int].show == "Int")
  assert(ShowType[String].show == "String")

  assert(ShowType[Option[Int]].show == "Option[Int]")
  assert(ShowType[List[Int]].show == "List[Int]")
  assert(ShowType[Vector[String]].show == "Vector[String]")
  assert(ShowType[Set[String]].show == "Set[String]")
}
