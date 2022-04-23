import scala.collection.mutable.ListBuffer
object Reverselist {
  def main(args: Array[String]): Unit ={
    println("Enter the number of element in List:")
    var num: Int =scala.io.StdIn.readInt()
    val mList1: ListBuffer[Int] = ListBuffer()
    for (j <-0 until num) {
      mList1.addOne(scala.io.StdIn.readInt())
    }
    println("Enter the orignal List:")
    println(mList1)
    println("Enter the Reversed List:")
    println(reverse(mList1))

  }
  def reverse(l:ListBuffer[Int]):ListBuffer[Int]={
    val mList2: ListBuffer[Int] = ListBuffer()
    for (i <- l.size - 1 to 0 by -1) {
      mList2.addOne(l(i))
    }
    return mList2
  }


}
