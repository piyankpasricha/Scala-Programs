//Run on hackerrank editor to see output
import scala.io.StdIn
object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
        
*/
   val n = StdIn.readInt()
    val arr:Vector[Int] = StdIn.readLine().split(' ').map(_.toInt).toVector
    val pre:Array[Array[Int]]= Array.ofDim[Int](10,10)
    println(solve(arr,pre))

    }
    
    def solve(arr:Seq[Int],pre:Array[Array[Int]]):Int = {
    
    def dist(a:Int, b:Int)= Math.abs(((a+9)%10)-((b+9)%10))
    
    arr match {
      
      case Nil => pre.foldLeft(Int.MaxValue)(_ min _.min)
      
      case x+:xs =>
      
        val now = Array.tabulate[Int](10,10) {
          case (`x`,j) => (for(k <- 0 until 10) yield pre(k)(j)+dist(x,k)+1).min
          case (i,`x`) => (for(k <- 0 until 10) yield pre(i)(k)+dist(x,k)+1).min
          case _ => Int.MaxValue>>2
        }
        solve(xs,now)
    }
  }
}
