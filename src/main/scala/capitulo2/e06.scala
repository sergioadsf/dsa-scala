package capitulo2

object e06 {


  // http://www.scalatest.org/user_guide/using_assertions

  def main(args: Array[String]): Unit = {

    def printArgs(args: Array[String]): Unit = {
      var i = 0
      while(i < args.length){
        println(args(i))
        i += 1
      }
    }
    printArgs(Array("zero", "um", "dois"))

    {
      def printArgs(args: Array[String]): Unit = {
        for(arg <- args){
          println(arg)
        }
      }
      printArgs(Array("tres", "quatro", "cinco"))
    }

    {
      def printArgs(args: Array[String]): Unit = {
        args.foreach(println)
      }
      printArgs(Array("seis", "sete", "oito"))
    }

    def formatArgs(args: Array[String]) = args.mkString("\n");
    val args = Array("nove", "dez")

    println(formatArgs(args))

    val res = formatArgs(Array("zero", "um", "dois"))
    assert(res == "zero\num\ndois")
    println("Feito!")

  }
}
