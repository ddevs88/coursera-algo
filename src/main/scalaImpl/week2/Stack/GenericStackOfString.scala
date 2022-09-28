package week2.Stack

//Implementing Stack using LinkedList
class GenericStackOfString[Item] {

  private var first: Node = null

  //Inner class
  private case class Node(item: Item, next: Node)

  def isEmpty: Boolean = {
    first == null
  }

  def push(x: Item): Unit = {
    val oldFirst = first
    first = Node(x, oldFirst)
    println("Element pushed!")
  }

  def pop(): Item = {
    var item = null.asInstanceOf[Item]
    if(!isEmpty){
      item = first.item
      first = first.next
    }
    else {
      item = s"It is empty!".asInstanceOf[Item]
    }
    item
  }
}



