package kindpoly

object Demo3 extends App {

  case class ShowType[T](val show: String)
  object ShowType {
    def apply[T](implicit st: ShowType[T]) = st
    
    implicit def showInt = ShowType[Int]("Int")
    implicit def showString = ShowType[String]("String")

    /*
    implicit def showOption = ShowType[Option]("Option")
    implicit def showList = ShowType[List]("List")
    implicit def showVector = ShowType[Vector]("Vector")
    implicit def showSet = ShowType[Set]("Set")

    implicit def showFA[F[_], A]
			(implicit stf: ShowType[F], sta: ShowType[A]) =
      	ShowType[F[A]](s"${stf.show}[${sta.show}]")
    */
  }

  assert(ShowType[Int].show == "Int")
  assert(ShowType[String].show == "String")

  /*
  assert(ShowType[Option].show == "Option")
  assert(ShowType[List].show == "List")
  assert(ShowType[Vector].show == "Vector")
  assert(ShowType[Set].show == "Set")

  assert(ShowType[Option[Int]].show == "Option[Int]")
  assert(ShowType[List[Int]].show == "List[Int]")
  assert(ShowType[Vector[String]].show == "Vector[String]")
  assert(ShowType[Set[String]].show == "Set[String]")
  */
}
