package capitulo03

object e10 {


  def main(args: Array[String]): Unit = {

    /*val firstArg = if (args.length > 0) args(0) else ""

    firstArg match {
      case "S" => println("Scala")
      case "J" => println("Java")
      case "P" => println("Python")
      case _ => println("E ?")
    }
  }*/

    val firstArg = if (!args.isEmpty) args(0) else ""

    val friend =
      firstArg match {
        case "S" => "Scala"
        case "J" => "Java"
        case "P" => "Python"
        case _ => "E ?"
      }

    println(friend)
  }

}
