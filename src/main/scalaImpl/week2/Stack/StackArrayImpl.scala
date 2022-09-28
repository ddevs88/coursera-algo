package week2.Stack

class StackArrayImpl(s: Array[String]) {

  private var n = 0

  def isEmpty: Boolean = {
    n == 0
  }

  def push(item: String): Unit = {
    s(n) = item
    n+=1
    println(s"Pushed in array Stack! at: ${n}")
  }

  def pop(): String = {
    val item = s(n-1)
    n-=1
    item
  }
}
object StackArrayImpl {
  def apply(n: Int): StackArrayImpl = {
    val s = new Array[String](n)
    new StackArrayImpl(s)
  }
}