package literaltypes

object Demo2 {
  case class Residue[M <: Int](n: Int) extends AnyVal {
    def +(rhs: Residue[M])(implicit m: ValueOf[M]): Residue[M] =
      Residue((this.n + rhs.n) % valueOf[M])
  }
 
  val fiveModTen = Residue[10](5)
  val nineModTen = Residue[10](9)
 
  fiveModTen + nineModTen    // OK == Residue[10](4)
 
  val fourModEleven = Residue[11](4)
 
  //fiveModTen + fourModEleven // compiler error: type mismatch;
                             //   found   : Residue[11]
                             //   required: Residue[10]
}
