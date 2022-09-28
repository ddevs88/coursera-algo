package week2.Stack

object ClientAppStack {

  def main(args: Array[String]): Unit = {
    //val stack = StackOfString()
    // val arrayStack = StackArrayImpl(10)
    //val resizingArrayStackOfString = ResizingArrayStackOfString()
    val genericStackOfString = new GenericStackOfString[String]
    //Provide empty string to start while loop using enter
    while (scala.io.StdIn.readLine().isEmpty) {
      println("Tell item: ")
      val str: String = scala.io.StdIn.readLine()
      if (str.equals("-")) {
        //println(stack.pop)
        //println(arrayStack.pop())
        //println(resizingArrayStackOfString.pop)
        println(genericStackOfString.pop())
      }
      else {
        //stack.push(str)
        //arrayStack.push(str)
        //resizingArrayStackOfString.push(str)
        genericStackOfString.push(str)
      }
    }
  }
}
