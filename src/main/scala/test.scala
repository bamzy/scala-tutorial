object test{

  def main(args: Array[String]): Unit
  =
  {
    var letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    for (i <- 1 to 10)
      println(letter(i));
  }
}