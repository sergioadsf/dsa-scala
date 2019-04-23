package capitulo03

object e05 {

  def main(args: Array[String]): Unit = {
    /* var line = ""
    var x = 1
    do {
      line = readLine()
      println("Read: "+ line)
      x += 1
    } while (line != "")
    println("Fim")*/

    /*var line = ""
    while ((line = readLine()) != "") {
      // Isso não funciona
      println("Read: " + line)
    }*/

    /*for (i <- 1 to 4) // 1 2 3 4
      println("Iteration: " + i)

    println("")

    for (i <- 1 until 4) // 1 2 3
      println("Iteration " + i)*/

    /* val filesHere = (new java.io.File("./")).listFiles
    for (file <- filesHere)
      println(file) */

    /*val filesHere = (new java.io.File("src/main/scala/capitulo03")).listFiles
    for (file <- filesHere)
      if (file.getName.endsWith(".scala"))
        println(file)*/

    /* val filesHere = (new java.io.File("src/main/scala/capitulo03")).listFiles
    for (file <- filesHere if file.getName.endsWith(".scala"))
      println(file) */

     /* val filesHere = (new java.io.File("src/main/scala/capitulo03")).listFiles
    for(
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala")
    ) println(file) */

    /* for (i <- 1 to 3; j <- 1 to 3)
      println((10 * i + j))*/

    /* for (i <- 1 to 3; j <- 1 to 3 if i != j)
      println((10 * i + j)) */

    /* var collection = for (i <- 1 to 10) yield i % 3
    println(collection) */
    // Yields Vector(1, 2, 0, 1, 2, 0, 1, 2, 0, 1)

    var myString = for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar // Yields "HIeflmlmop"
    println(myString)
  }
}
