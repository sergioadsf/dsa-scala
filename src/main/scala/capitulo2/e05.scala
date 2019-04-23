package capitulo2

object e05 {

  def main(args: Array[String]): Unit = {

    // http://docs.scala-lang.org/overviews/collections/maps.html

    import scala.collection.mutable

    val treasureMap = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))
    treasureMap.put(4, "YESSS")

    val romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )

    println(romanNumeral(4))
  }
}
