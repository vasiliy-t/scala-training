package example

object Hello {
  def main(args: Array[String]): Unit = {
    val c = new Calc()
    println(c.total(args(0).toDouble, args(1).toDouble))
  }
}
