package week2.queue

class LinkedQueueOfString {

  private var first: Node = null;
  private var last: Node = null;

  private case class Node(var item: String, var next: Node)

  def isEmpty: Boolean = {
    first == null
  }

  def enqueue(item: String): Unit = {
    var oldLast = last
    last = Node(item, oldLast)
    if(isEmpty) first = last //Special case for empty queue
    else oldLast.next = last
  }

  def dequeue(): String = {
    val item = first.item
    first = first.next
    if(isEmpty) last = null
    item
  }
}
object LinkedQueueOfString {
  def apply(): LinkedQueueOfString = {
    new LinkedQueueOfString
  }
}
