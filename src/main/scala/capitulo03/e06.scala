package capitulo03

import java.io.File

object e06 {

  var filesHere = (new java.io.File("src/main/scala/capitulo03")).listFiles

  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList

  /*def grep(pattern: String) =
    for(
      file <- filesHere if file.getName.endsWith(".scala");
      line <- fileLines(file)
      if line.trim.matches(pattern)
    ) println(file + ": " + line.trim)*/

   def grep(pattern: String) =
    for {
      file <- filesHere  if file.getName.endsWith(".scala");
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    } println(file + ": " + trimmed)


  def main(args: Array[String]): Unit = {

    // Não é comum em Scala
    /*for (i <- 0 to filesHere.length - 1)
      println(filesHere(i))*/

    grep(".*gcd.*")
  }
}
