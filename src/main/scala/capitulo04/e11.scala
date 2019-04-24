package capitulo04

object e11 {

  def misc1(): Unit = {
    val someNumbers = List(-11, -10, -5, 0, 5, 10)

    someNumbers.foreach(x => println(x))
    println("----")
    someNumbers.foreach(println _)
    println("----")
    someNumbers.foreach(println)
  }

  def isEven(x: Int): Boolean =
    if(x == 0) true else isOdd(x - 1)

  def isOdd(x: Int): Boolean =
    if(x == 0) false else isEven(x - 1)

  val funValue = nestedFun _

  def nestedFun(x: Int): Unit = {
    if(x != 0) { println(x); funValue(x - 1)}
  }

  def main(args: Array[String]): Unit = {
    //misc1()

    println("isEven(2) [" + isEven(2) + "]")
    //nestedFun(-10)
  }
}
