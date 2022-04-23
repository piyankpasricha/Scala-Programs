object Stringcompression {
  def main(args: Array[String]): Unit ={
    val s=scala.io.StdIn.readLine()
    val buffer= new StringBuffer
    var i=0
    while(i<s.length){
      var j=i
      var cnt=0
      while(j<s.length && s(i) == s(j)){
        cnt+=1
        j+=1
      }
      if (cnt==1) buffer.append(s(i))
      else buffer.append(s(i) + "" + cnt)
      i += cnt
    }
    println(buffer.toString)
  }

}
