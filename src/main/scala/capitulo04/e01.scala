package capitulo04

object e01 {

  class Rational(n: Int, d: Int) {

    require(d != 0)

    val numer: Int = n
    val denom: Int = d

    println("created "+ n +"/" + d)

    def add(that: Rational): Rational =
      new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

    override def toString: String = n + "/" + d
  }

  def main(args: Array[String]): Unit = {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    val test = oneHalf.add(twoThirds)

    println(test.toString)
    println(test.numer + "/" + test.denom)
  }
}
