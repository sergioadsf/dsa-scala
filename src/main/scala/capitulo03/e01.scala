package capitulo03

class SomaNumeros {

  private var sum  = 0

  def add(b : Byte): Unit = {
    sum += b
  }

  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }
}

object e01 {
  def main(args: Array[String]): Unit = {
    var acc = new SomaNumeros
    acc.add(20)
    println("Checksum "+ acc.checksum())
  }
}
