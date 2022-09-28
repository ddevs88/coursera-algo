package week2.Stack

class ResizingArrayStackOfString() {

  private var s = new Array[String](1)
  private var n = 0

  def isEmpty: Boolean = {
    n == 0
  }

  //Double the array when it is full
  def push(item: String): Unit = {
    if(n == s.length) resize(2*s.length)
    s(n) = item
    n+=1
    println(s"pushed using resize array at: ${n-1} ")
  }

  //half the array when it is one-quarter full
  def pop: String = {
    val item = s(n-1)
    n-=1
    if(n>0&&n==s.length/4) resizeOnPop(s.length/2)
    println(s"Array after pop: ${s.length}")
    item
  }

  def resizeOnPop(capacity: Int): Unit = {
    val copy = new Array[String](capacity)
    if(capacity > 0){
      for(i <- 0 until s.length / 2){
        copy(i) = s(i)
      }
    }
    s = copy
  }

  def resize(capacity: Int): Unit = {
    val copy = new Array[String](capacity)
    if(capacity > 0){
      for(i <- s.indices){
        copy(i) = s(i)
      }
    }
    s = copy
  }

}
object ResizingArrayStackOfString {
  def apply(): ResizingArrayStackOfString = {
    new ResizingArrayStackOfString()
  }
}
