package week2.Stack

//Implementing Stack using LinkedList
class StackOfString {

  private var first: Node = null

  //Inner class
  private case class Node(item: String, next: Node)

  def isEmpty: Boolean = {
    first == null
  }

  def push(x: String): Unit = {
    val oldFirst = first
    first = Node(x, oldFirst)
    println("Element pushed!")
  }

  def pop(): String = {
    if(!isEmpty){
      val item = first.item
      first = first.next
      item
    }
    else{
      "Stack is Empty!"
    }
  }
}
object StackOfString{
  def apply(): StackOfString = {
    new StackOfString()
  }
}


