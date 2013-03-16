
// given a list of things, return a list of things paired up
def pair(l: List[Any]): List[Pair[Any,Any]] = l match {
  case x :: y :: z => Pair(x,y) :: pair(z)
  case List(x) => Pair(x,None) :: List()
  case _ => List()
}

val l1 = List(1,2,3,4,5)
val l2 = List()
val l3 = List(3)

println(l1)
println("Paired: " + pair(l1))

println(l2)
println("Paired: " + pair(l2))

println(l3)
println("Paired: " + pair(l3))
