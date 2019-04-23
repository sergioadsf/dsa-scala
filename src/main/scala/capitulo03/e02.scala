package capitulo03


class SomaNumeros2 {
  private var sum = 0
  def add(b: Byte) = sum += b
  def checksum() = ~(sum & 0xFF) + 1
}

import scala.collection.mutable

object SomaNumeros2 {

  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new SomaNumeros2
      for (c <- s)
        acc.add(c.toByte)

      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}


import SomaNumeros2.calculate

object e02 {

  def main(args: Array[String]): Unit = {

    /*
      for (arg <- args)
        println(arg + ": "+ calculate(arg))
    */

     println(calculate("AB"))

    //println("30 + 20 = " + Calculadora.add(30, 20))
  }
}
