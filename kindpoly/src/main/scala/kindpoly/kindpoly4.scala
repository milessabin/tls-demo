package kindpoly

object Demo4 extends App {

  case class ShowType[T](val show: String)
  object ShowType {
    def apply[T](implicit st: ShowType[T]) = st
    
    implicit def showInt = ShowType[Int]("Int")
    implicit def showString = ShowType[String]("String")

    implicit def showFA[F[_], A]
			(implicit stf: ShowType1[F], sta: ShowType[A]) =
      	ShowType[F[A]](s"${stf.show}[${sta.show}]")
  }

  case class ShowType1[F[_]](val show: String)
  object ShowType1 {
    def apply[F[_]](implicit st: ShowType1[F]) = st

    implicit def showOption = ShowType1[Option]("Option")
    implicit def showList = ShowType1[List]("List")
    implicit def showVector = ShowType1[Vector]("Vector")
    implicit def showSet = ShowType1[Set]("Set")
  }

  assert(ShowType[Int].show == "Int")
  assert(ShowType[String].show == "String")

  assert(ShowType1[Option].show == "Option")
  assert(ShowType1[List].show == "List")
  assert(ShowType1[Vector].show == "Vector")
  assert(ShowType1[Set].show == "Set")

  assert(ShowType[Option[Int]].show == "Option[Int]")
  assert(ShowType[List[Int]].show == "List[Int]")
  assert(ShowType[Vector[String]].show == "Vector[String]")
  assert(ShowType[Set[String]].show == "Set[String]")
}
