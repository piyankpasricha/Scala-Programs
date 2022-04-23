import scala.io.StdIn.readLine
object captainprime {
  def main(args: Array[String]) {
    val t = scala.io.StdIn.readInt
    for(i <- 1 to t)
      println(decide(readLine));
  }

  def decide(s:String):String = {
    if(s.contains("0") || !BigInt(s).isProbablePrime(20)) return "DEAD";
    else{
      val R = isRight(s.dropRight(1));
      val L = isLeft(s.substring(1));
      if(L && R)
        return "CENTRAL";
      else if(L)
        return "LEFT";
      else if(R)
        return "RIGHT";
      else
        return "DEAD";
    }
  }
  def isLeft(s:String):Boolean = {
    if(s.isEmpty) return true;
    return BigInt(s).isProbablePrime(20) && isLeft(s.substring(1));
  }
  def isRight(s:String):Boolean = {
    if(s.isEmpty) return true;
    return BigInt(s).isProbablePrime(20) && isRight(s.dropRight(1));
  }


}
