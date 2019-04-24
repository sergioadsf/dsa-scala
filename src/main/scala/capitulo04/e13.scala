package capitulo04

object e13 {

  def printTime(out: java.io.PrintStream = Console.out) =
    out.println("time = "+System.currentTimeMillis())

  def printTime2(out: java.io.PrintStream = Console.out,
                 divisor: Int = 1) =
    out.println("time = "+System.currentTimeMillis() / divisor)

  def main(args: Array[String]): Unit = {
    //printTime()

    //printTime(Console.err)

    //printTime2()
    printTime2(out=Console.err)
    //printTime2(divisor=1000)
    //printTime2(out=Console.err, divisor=1000)
  }
}
