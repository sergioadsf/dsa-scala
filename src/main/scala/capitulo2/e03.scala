package capitulo2

object e03 {

  def main(args: Array[String]): Unit = {

    val pair = (10, "João Silva", 8000f)
    println(pair._1)
    println(pair._2)
    println(pair._3)

    val (codigo, nome, salario) = pair
    println(salario)
  }

}
