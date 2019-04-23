package capitulo04

object e04 {


  class Rational(n: Int, d: Int) {

    require(d != 0)

    private val g = gcd(n.abs, d.abs)

    val numer: Int = n / g
    val denom: Int = d / g

    // Construtor auxiliar
    def this(n: Int) = this(n, 1)

    override def toString: String = numer + "/" + denom

    def add(that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)


  }

  def main(args: Array[String]): Unit = {
    var number = new Rational(66, 42)
    println(number)
  }
}
