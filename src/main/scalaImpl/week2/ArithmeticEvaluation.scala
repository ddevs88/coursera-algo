package week2

import scala.collection.mutable

object ArithmeticEvaluation {

  def main(args: Array[String]): Unit = {
    var ops = new mutable.Stack[String]
    var vals = new mutable.Stack[Double]

    val n = 17
    var i = 0
    while(i<n){
      println("Enter:")
      val s = io.StdIn.readLine()
      if(s.equals("(")){
        println("Do nothing!")
        i+=1
      }
      else if(s.equals("+")) {
        ops.push(s)
        println(s"ops pushed: ${s}")
        i+=1
      }
      else if(s.equals("*")) {
        ops.push(s)
        println(s"ops pushed: ${s}")
        i+=1
      }
      else if(s.equals(")")) {
        val op = ops.pop
        println(s"ops popped: ${op}")
        if(op.equals("+")) {
          val v1 = vals.pop()
          val v2 = vals.pop()
          vals.push(v1+v2)
          println(s"vals pushed: ${v1+v2}")
        }
        else if(op.equals("*")) {
          val v3 = vals.pop()
          val v4 = vals.pop()
          vals.push(v3*v4)
          println(s"vals pushed: ${v3*v4}")
        }
        i+=1
      }
      else {
        vals.push(s.toDouble)
        println(s"vals single pushed: ${s}")
        i+=1
      }
    }
    println(s"Final result: ${vals.pop}")
  }
}
