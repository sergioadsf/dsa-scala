package capitulo04

import java.util.Date

object e10 {

  def main(args: Array[String]): Unit = {
    val date = new Date

    val logWithDateBound = log(date, _ : String)

    logWithDateBound("message1")
    logWithDateBound("message2")

  }

  def log(date: Date, message: String) = {
    println(date + " - "+ message)
  }
}
