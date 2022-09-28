package week1

class QuickFind(id: Array[Int]){

  private[week1] def connected(p: Int, q: Int): Boolean = {
    id(p)==id(q)
  }
  private[week1] def union(p: Int, q:Int): Unit = {
    val pId = id(p)
    val qId = id(q)
    if(pId != qId){
      for(i <- 0 until id.length){
        if(id(i) == pId) id(i) = qId
      }
    }
  }
}
object QuickFind {

  def apply(n: Int): QuickFind = {
      var id = new Array[Int](n)
      for(i <- 0 until n){
        id(i) = i
      }
    new QuickFind(id)
  }
}


