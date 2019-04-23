package capitulo03

object e11 {

  def main(args: Array[String]): Unit = {

    /* val a = 1;

    {
      val a = 2;
      {
        println(a)
      }
    }*/
    println(20 << 1)
    printMultiTable()
  }

  def printMultiTable() = {

    var i = 1

    while(i <= 10) {

      var j = 1

      while (j <= 10) {
        val prod = (i * j).toString

        var k = prod.length

        while (k < 4) {
          print(" ")
          k += 1
        }

        print(prod)
        j += 1
      }

      println()
      i += 1
    }
  }
}
