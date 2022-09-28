package week1

class QuickUnion(id: Array[Int]) {

  //Chase parent pointer until reach root (depth of i array accesses)
  private def root(x: Int): Int = {
    var i = x
    while(i!= id(i)) i = id(i)
    i
  }

  //Check if p and q have same root (depth of p and q array accesses)
  def connected(p:Int, q:Int): Boolean = {
    root(p) == root(q)
  }

  //Change root of p to point root of q (depth of p and q array accesses)
  private[week1] def union(p:Int, q:Int): Unit = {
    val i = root(p)
    val j = root(q)
    id(i) = j
  }
}
object QuickUnion {
  def apply(n: Int): QuickUnion = {
    //Set id of each object to itself (N Array accesses)
    val id = new Array[Int](n)
    for(i <- 0 until id.length){
      id(i) = i
    }
    new QuickUnion(id)
  }
}
