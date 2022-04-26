//Add below lines in function missingNumber on hackerrank editor to see output
def missingNumbers(arr: Array[Int], brr: Array[Int]): Array[Int] = {
    // Write your code here
    val m=brr.min
    val z=new Array[Int](101)
    for(x<-arr)z(x-m)-=1
    for(x<-brr)z(x-m)+=1
    return(z.zipWithIndex.filter(_._1>0).map(_._2+m))


    }
