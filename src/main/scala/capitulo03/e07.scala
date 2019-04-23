package capitulo03

object e07 {

  var filesHere = (new java.io.File("src/main/scala/capitulo03")).listFiles

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  def scalaFiles =
    for(
      file <- filesHere
      if file.getName.endsWith(".scala")
    ) yield file

  val forLineLengths =
    for {
      file <- filesHere
      if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
    } yield trimmed.length

  def main(args: Array[String]): Unit = {

    // val collection = scalaFiles
    val collection = forLineLengths

    for (length <- collection)
      println(length)
  }

}
