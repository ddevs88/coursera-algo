package week2.queue

object ClientAppQueue {

  def main(args: Array[String]): Unit = {
    val linkedQueueOfString = LinkedQueueOfString()
    //Provide empty string to start while loop using enter
    while (scala.io.StdIn.readLine().isEmpty) {
      println("Tell item: ")
      val str: String = scala.io.StdIn.readLine()
      if (str.equals("-")) {
        println(linkedQueueOfString.dequeue())
      }
      else {
        linkedQueueOfString.enqueue(str)
      }
    }
  }
}
