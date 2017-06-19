package training

object Upper {
  def main(args:Array[String]) {
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println("")
  }
}
