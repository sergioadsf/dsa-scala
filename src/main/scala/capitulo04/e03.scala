package capitulo04




object e03 {

  class Rational(n: Int, d: Int) {

    require(d != 0)

    val numer: Int = n
    val denom: Int = d

    // Construtor auxiliar
    def this(n: Int) = this(n, 1)

    override def toString: String = numer + "/" + denom

    def add(that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    def lessThan(that: Rational) =
      this.numer * that.denom < that.numer * this.denom

    def max(that: Rational) =
      if (this.lessThan(that)) that else this

  }

  def main(args: Array[String]): Unit = {

    val y = new Rational(3)
    println(y)

  }

}
