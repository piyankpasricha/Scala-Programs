import scala.collection.mutable.ArrayBuffer
object ListReplication {
  def main(args: Array[String]) {
    println("Enter the number of times element should be repeated:")
    var n: Int = scala.io.StdIn.readInt()
    println("Enter the number of element in array")
    var num: Int = scala.io.StdIn.readInt()
    var elements = ArrayBuffer[Int]()
    var element = ArrayBuffer[Int]()
    for (j <-0 until num) {
      var input = scala.io.StdIn.readInt()
      elements.append(input)
      for(k<-0 until n)
      {
        element.append(elements(j))
      }
    }
    for(j<-0 to element.length-1)
    {
      println(element(j))
    }

    }

}
