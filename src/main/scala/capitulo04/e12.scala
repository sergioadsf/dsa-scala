package capitulo04

object e12 {

  def makeIncreaser(more: Int) = (x: Int) => x + more

  def main(args: Array[String]): Unit = {
    val inc1 = makeIncreaser(1)

    println(inc1(10))
  }
}
