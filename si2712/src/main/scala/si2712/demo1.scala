package si2712

object Demo1a {
  def meh[M[_], A](x: M[A]): M[A] = x

  //meh((x: Int) => x) // solves ?M = [X](Int => X) and ?A = Int ...
}
