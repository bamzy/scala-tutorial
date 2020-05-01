object Tutorial_Basics_Day1{

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


    //Formatting pretty similar to java
    val name = "Bamzy"
    val age = 31
    val weight = 82.237
    println(f"My name is ${name} and I'm ${age} years old and I weight ${weight}%50.12f")

    //How to left/right justify numbers and strings
    printf("'%5d'\n",15)
    printf("'%5d'\n",15)
    printf("'%5s'\n","hi")
    printf("'%-5s'\n","hi")

    //A more complicated function
    def getSum(num1: Int = 0, num2: Int = 0) : Int =
      { return num1+num2}
    println(getSum(3))


    //Use unit when you'r not returnint anything;
    def sayHello() : Unit = {
      println("Hellooo all")
    }
    sayHello

    //How to pass arrays
    def getArrSum(nums: Array[Int]): Int = {
      var res = 0
      for (num <- nums) {
        res += num
      }
      res
    }
    var nums = Array(1,2,3,4,5,6)
    println("Res is " + getArrSum(nums ))

  }
}