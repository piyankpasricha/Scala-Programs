import scala.io.StdIn.readLine
object Reversefactorization {
  def main(args: Array[String]) {
    val input = io.Source.stdin.getLines
    val pair = input.next.split(' ').map(_.toInt)
    val n = pair(0)
    val k = pair(1)
    val numbers = input.next.split(' ').map(_.toInt)

    val divisors = numbers.filter(x =>n % x == 0).sorted.reverse

    if (divisors.isEmpty) println(-1)
    else {
      println(findPath(n, divisors))
    }
  }

  def findPath(n: Int, divisors: Array[Int]): String = {
    def checkPath(n: Int, divisors: Array[Int]): List[Int] = {
      if (divisors.isEmpty) throw new Exception("no solution")
      val divisor = divisors.head
      if (n % divisor == 0) {
        val divided = n / divisor
        if (divided == 1) n :: Nil
        else n :: checkPath(divided, divisors)
      } else {
        checkPath(n, divisors.tail)
      }
    }

    try {
      val path = 1 :: (checkPath(n, divisors).reverse)
      path mkString " "
    } catch {
      case e: Exception => "-1"
    }
  }

}
