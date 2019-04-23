package capitulo03

object e04 {

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }

  def gcd(x: Long, y: Long): Long =
    if (y == 0) x else gcd(y, x % y)

  def main(args: Array[String]): Unit = {
    println(gcdLoop(15, 10))
    println(gcd(10, 15))
  }

}
