object Tutorial_Basics{

  def main(args: Array[String])
  {
    //My first function
    def myFirstFunSqrt(i: Int) =
       i*i;
    // first function call
    println(myFirstFunSqrt(3))

    //Wow you get to use one loop in a nested way
    for (i <- 1 to 3; j<- 10 to 12; k <- 40 to 42)
      println(i,j,k)


    // Another wow! this converts a whole array of strings to int
    val list = List("1","2","3","4")
    val ints = list.map(s => s.toInt)
  }
}