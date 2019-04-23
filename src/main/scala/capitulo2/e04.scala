package capitulo2

object e04 {

  def main(args: Array[String]): Unit = {

    // http://docs.scala-lang.org/overviews/collections/sets.html

    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))

    jetSet = jetSet + "Lear"
    println("jetSet [" + (jetSet) + "]")

    var jetSet2 = Set("Airbus", "Embraer")

    var jetSet3 = jetSet ++ jetSet2
    println("jetSet [" + (jetSet3) + "]")

    jetSet3 = jetSet3 - ("Airbus", "Boeing")
    println("jetSet [" + (jetSet3) + "]")

    import scala.collection.mutable

    val movieSet = mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    movieSet.add("Friday the 13th")
    println(movieSet)

    for (movie <- movieSet){
      println(movie)
    }

    movieSet.foreach(movie => println(movie))
  }
}
