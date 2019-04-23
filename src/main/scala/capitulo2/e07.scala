package capitulo2

object e07 {

  def main(args: Array[String]): Unit = {
    import scala.io.Source

    if(args.length > 0){

      for (line <- Source.fromFile(args(0)).getLines())
        println(line.length + " " + line)
    }
    else
      Console.err.println("Por favor, digite o nome do arquivo!")
  }
}
