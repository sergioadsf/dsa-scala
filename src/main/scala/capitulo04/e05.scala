package capitulo04


// Definindo operadores
object e05 {

  class Rational(n: Int, d: Int) {

    require(d != 0)

    val numer : Int = n
    val denom : Int = d

    def this(n: Int) = this(n, 1)

//    def add(that: Rational): Rational =
//    Substitui o add por +
    def +(that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    def *(that: Rational) : Rational =
      new Rational(numer * that.numer, denom * that.denom)

    override def toString: String = n + "/" + d

    private def gcd(a: Int, b: Int): Int =
      if(b == 0) a else gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(1, 2)
    val y = new Rational(2, 3)

//    println(x add y)
//    Substitui o add por +
//    println(x * y) =
    println(x.+(y))
  }
}
