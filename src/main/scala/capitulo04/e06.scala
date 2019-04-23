package capitulo04

object e06 {

  class Rational(n: Int, d: Int) {

    require(d != 0)

    private val g = gcd(n.abs, d.abs)
    val numer : Int = n / g
    val denom : Int = d / g

    def this(n: Int) = this(n, 1)

    //    def add(that: Rational): Rational =
    //    Substitui o add por +
    def +(that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    def +(i: Int): Rational =
      new Rational(numer + i * denom, denom)

    def -(that: Rational): Rational =
      new Rational(
        numer * that.denom - that.numer * denom,
        denom * that.denom
      )

    def -(i: Int): Rational =
      new Rational(numer - i * denom, denom)

    def *(that: Rational) : Rational =
      new Rational(numer * that.numer, denom * that.denom)

    override def toString: String = n + "/" + d

    private def gcd(a: Int, b: Int): Int =
      if(b == 0) a else gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(2, 3)
    println(x + x)
    println(x + 2)
  }
}
