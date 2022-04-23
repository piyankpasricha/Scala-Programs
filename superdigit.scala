import scala.io.StdIn.readLine
object superdigit {
  def main(args: Array[String]): Unit = {
    val input = readLine.split(" ")
    val k = input(1).toLong
    var n = input(0).map(_.toLong - '0').sum * k

    while (n >= 10) {
      n = n.toString.map(_.toLong - '0').sum
    }
    println(n)
  }

}
