package capitulo2

object e02 {

  // Usando listas
  def main(args: Array[String]): Unit = {
    val numNames = Array("zero", "um", "dois")
    println("numNames.toList [" + numNames.toList + "]")

    val numNames2 = Array.apply("zero", "um", "dois")
    println("numNames2.toList[" + numNames2.toList + "]")

    val oneTwoThree = List(1, 2, 3)
    println("oneTwoThree [" + oneTwoThree.toList + "]")

    {
      val oneTwo = List(1, 2)
      val threeFour = List(3, 4)
      val oneTwoThreeFour = oneTwo ::: threeFour
      println(oneTwo + " e " + threeFour + " não foram alteradas!")
      println("Logo, " + oneTwoThreeFour + " é uma nova lista!")
    }

    {
      val twoThree = List(2, 3)
      val oneTwoThree = 1 :: twoThree
      println(oneTwoThree)
    }

    {
      val oneTwoThree = 1 :: 2 :: 3 :: Nil
      println(oneTwoThree)
    }
  }
}
