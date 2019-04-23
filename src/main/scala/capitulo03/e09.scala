package capitulo03

object e09 {

  def main(args: Array[String]): Unit = {

    /*val n = 10

    val half =
      if (n % 2 == 0)
        n / 2
      else
        throw new RuntimeException("Algo ocorreu")

    println(half)*/

    /*import java.io.FileReader
    import java.io.FileNotFoundException
    import java.io.IOException

    try {
      val f = new FileReader("src/main/scala/capitulo03/e09.scala1")
    } catch {
      case ex: FileNotFoundException => println("Arquivo não encontrado")
      case ex: IOException => println("Verifique se o arquivo está válido")
    }*/

    import java.net.URL
    import java.net.MalformedURLException

    def urlFor(path: String) =
      try {
        println("Mensagem antes de criar o objeto")
        new URL(path)
        println("Mensagem depois de criar o objeto")
      } catch {
        case e: MalformedURLException => new URL("http://www.scala-lang.org")
      }
      finally {
        println("Fim")
      }

    urlFor("http://www.datascienceacademy.com.br")
  }
}
