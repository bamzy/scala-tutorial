object test{

  def main(args: Array[String]): Unit
  =
  {
    var letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    var myList = List("a",2,true)
    var a= 3
    a = 4
    for (i <- myList)
      println(i)
    for (i <- 1 to 10)
      println(letter(i));
  }
}