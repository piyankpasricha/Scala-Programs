//Run on hackerrank editor to see output
import scala.collection.mutable
object Solution {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
        
*/val data = mutable.Map[(Int, Int, Dice), Int]()
  def main(args: Array[String]): Unit = {

    val t = scala.io.StdIn.readInt
    
    for(i<-0 until t){ 
    var num1=scala.io.StdIn.readLine.split(" ")
    println(solve( num1(0).toInt,num1(1).toInt))}
  }

  def solve(m: Int, n: Int): Int = {
    def inner(m: Int, n: Int, dice: Dice, acc: Int): Int = data.getOrElseUpdate((m, n, dice),
      if (m < 0 || n < 0) 0 else
        math.max(inner(m - 1, n, dice.turnFront, dice.top), inner(m, n - 1, dice.turnRight, dice.top))
    ) + acc

    inner(m - 1, n - 1, Dice(1, 2, 3), 0)
    
  }

  case class Dice(top: Int, front: Int, left: Int) {
    private val pairwiseSum = 7

    def right: Int = pairwiseSum - left

    def turnRight: Dice = Dice(left, front, bottom)

    def bottom: Int = pairwiseSum - top

    def turnFront: Dice = Dice(back, top, left)

    def back: Int = pairwiseSum - front
  }

}
