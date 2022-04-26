//Run on hackerrank editor to see output
import scala.collection.mutable.ListBuffer
def f(arr:List[Int]):List[Int] ={
    val mList2: ListBuffer[Int] = ListBuffer()
    for (i <- arr.size - 1 to 0 by -1) {
      mList2.addOne(arr(i))
    }
    return mList2.toList
}
