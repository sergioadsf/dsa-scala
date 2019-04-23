package capitulo03

object e03 {

  def printProd2(): Unit = {
    val s = "Hello"; println(s)
  }

  def check(x: Int): Unit = {
    if (x < 5)
      println("Menor que 5")
    else
      println("Ok")
  }

  def main(args: Array[String]): Unit = {
    printProd2()
    check(3)
  }
}
