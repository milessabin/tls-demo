package si2712

trait Functor[F[_]] {
  def map[A, B](f: A => B, fa: F[A]): F[B]
}

object Functor {
  implicit def either[L] =
    new Functor[({ type λ[t] = Either[L, t] })#λ] {
      def map[A, B](f: A => B, fa: Either[L, A]): Either[L, B] =
        fa.right.map(f)
    }
}

object FunctorSyntax {
  implicit class FunctorOps[F[_], A](fa: F[A])(implicit F: Functor[F]) {
    def map[B](f: A => B): F[B] = F.map(f, fa)
  }
}

object Demo2 {
  import FunctorSyntax._

  val foo: Either[Int, String] = Right("foo")
  val bar: Either[Int, String] = Left(23)

  assert(foo.map(_.length) == Right(3))
  assert(bar.map(_.length) == Left(23))
}
