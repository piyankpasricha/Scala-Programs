//It should be run  on hackerrank editor to get output
import scala.io.StdIn.readInt
import scala.io.StdIn.readLine

object Solution {
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    var t = readInt()
    val a = Array.ofDim[Int](301)
    val g = Array.ofDim[Int](301)
     //Doing xor on whether consecutive pins will go together or not
    for (i <- 1 to 300) {
      for (left <- 0 to i - 1) {
        g(a(left) ^ a(i - left - 1)) = i
        if (i - left - 2 >= 0)
          g(a(left) ^ a(i - left - 2)) = i
      }
      var x = 0
      while (g(x) == i)
        x = x + 1
      a(i) = x
    }
    while (t > 0) {
      t = t - 1;
      val n = readInt()
      val s = readLine().trim()
      var i = 0
      var res = 0
      while (i < s.length()) {
        var j = i
        while (j < s.length() && s(j) == 'X')
          j = j + 1
        i = j
        while (j < s.length() && s(j) == 'I')
          j = j + 1
        if (i < s.length())
          res = res ^ a(j - i)
        i = j
      }
      if (res == 0)
        println("LOSE")
      else
        println("WIN")
    }
    }
}
