package capitulo2

import scala.io.Source

object e08 {

  def main(args: Array[String]): Unit = {

    def countChars(args: Array[String]): Unit = {

      def widthOfLength(s: String) = s.length

      if (args.length > 0) {
        val lines = Source.fromFile(args(0)).getLines().toList
        var maxWidth = 0
        for (line <- lines)
          maxWidth = maxWidth.max(widthOfLength(line))

        println("maxWidth [" + (maxWidth) + "]")
      }

    }

    countChars(Array("teste.txt"))
  }
}
