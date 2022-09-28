package week1

object BinarySearch {

  def bSearch(ar: Array[Int], n: Int): Int = {
    var low = 0
    var high = ar.length-1

    while(low <= high){
      val mid = low + (high-low)/2
      if(n < ar(mid)){
        high = mid-1
      }
      else if(n > ar(mid)){
        low = mid+1
      }
      else return mid
    }
    -1
  }
  def main(args: Array[String]): Unit = {

    val ar = Array(1,2,3,4,5,6,7,8)
    val n = 5
    println(bSearch(ar, n))
  }
}
