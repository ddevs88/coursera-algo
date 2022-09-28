package week1

// Same as week1.QuickUnion, but maintain the extra array sz[i] to count number of objects
// in the tree rooted at i
class ImprovedQuickUnion(id: Array[Int], sz: Array[Int]) {

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
  //This is modified - Link root of smaller tree to root of larger tree
  //Update the sz[] array
  private[week1] def union(p:Int, q:Int): Unit = {
    val i = root(p)
    val j = root(q)
    if(i == j) return
      if(sz(i) > sz(j)) {
        id(i) = j
        sz(j) += sz(i)
      }
    else{
        id(j) = i
        sz(i) += sz(j)
      }
  }
}
object ImprovedQuickUnion {
  def apply(n: Int): ImprovedQuickUnion = {
    //Set id of each object to itself (N Array accesses)
    val id = new Array[Int](n)
    val sz = new Array[Int](n)
    for(i <- 0 until id.length){
      id(i) = i
      sz(i) = 1
    }
    new ImprovedQuickUnion(id, sz)
  }
}