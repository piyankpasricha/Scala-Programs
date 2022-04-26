//Run on hackerrank editor to see output
object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
   //taking inputs from user 
    val input = io.Source.stdin.getLines
    val pair = input.next.split(' ').map(_.toInt)
    val n = pair(0)
    val k = pair(1)
    val numbers = input.next.split(' ').map(_.toInt)
   //checking number is divisor of given number or not
    val divisors = numbers.filter(x =>n % x == 0).sorted.reverse

    if (divisors.isEmpty) println(-1)
    else {
      println(findPath(n, divisors))
    }
    }
 //Finding smallest path using nested function
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
