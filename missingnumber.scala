import scala.io.StdIn.readLine
object missingnumber {
  def main(args: Array[String]): Unit = {
    val arr1 = readLine().split(' ').map(_.toInt)
    val arr2 = readLine().split(' ').map(_.toInt)
    val m=arr2.min
    val z=new Array[Int](101)
    for(x<-arr1)z(x-m)-=1
    for(x<-arr2)z(x-m)+=1
    println(z.zipWithIndex.filter(_._1>0).map(_._2+m).mkString(" "))

  }
}
