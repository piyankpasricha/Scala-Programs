import scala.io.StdIn
object banglorebank {
  def solve(arr:Seq[Int],pre:Array[Array[Int]]= Array.ofDim[Int](10,10)):Int = {
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


  def main(args: Array[String]) {
    val n = StdIn.readInt()
    val arr:Vector[Int] = StdIn.readLine().split(' ').map(_.toInt).toVector
    println(solve(arr))
  }

}
