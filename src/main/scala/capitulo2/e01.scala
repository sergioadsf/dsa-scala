package capitulo2

object e01 {

  def main(args: Array[String]) {

    val greetStrings: Array[String] = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world\n"
    for (i <- 0 to 2)
      print(greetStrings(i))
  }
}
