//Copy this code on hackerrank editor to see output
import scala.collection.mutable.ArrayBuffer
var elements = ArrayBuffer[Int]()
var element = ArrayBuffer[Int]() 
//Function to print given number n number time in array
def f(num:Int,arr:List[Int]):List[Int] ={
      for (j <-0 until arr.length) {
      elements.append(arr(j))
      //Stoting n number of time in array each element
      for(k<-0 until num)
      {
        element.append(elements(j))
      }
    }
     return element.toList
 }
