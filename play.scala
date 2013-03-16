

val s = "test:value more:other"

println(s);

val pair: Tuple2[Int,Int] = (3,4)
val pair2 = (3,5)
val l = List(pair, pair2,
  "This is a string",
  List(1,2,3,4))

for (p <- l) {
  p match {
    case (3,value) => println("I found a pair with 3, then "+value)
    case first :: second :: list => println("I found a list with first="+first+" and second="+second)
    case _ => println("Unknown!"+ p)
  }
}

