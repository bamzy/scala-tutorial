import scala.collection.mutable.ArrayBuffer

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
    //Two ways of defining arrays
    var nums = Array(1,2,3,4,5,6)
    var nums1 = new Array[Int](100)
    println("Res is " + getArrSum(nums1 ))

    //cool operations on array
    val buff = Array[String]("aaaaa","bbbbb","ccccc","ddddd")
    //cool way of printing arrays
    val test = for (num <- buff) yield "|"+ num + "|"
    test.foreach(print)

    //A 2D array
    var dd = Array.ofDim[Int](10,10)
    for (i<- 0 to 9; j <- 0 to 9){
      dd(i)(j) = j+i
    }
    dd.foreach { row => row foreach print; println }
    print(dd.map(_.mkString(",")).mkString("\n"))

    //Cool features on an array
    println("")
    println(nums.sum)
    println(nums.min)
    println(nums.max)


    //Maps
    val employee = Map("1" -> "Bob", "2"-> "Ali")
    if (employee.contains("1"))
      println("yes")

    val customers = collection.mutable.Map(100 -> "A", 1001-> "B")
    customers(170) = "C"
    println(customers(100))

    //Iterate Map
    for ((k,v) <- customers)
      printf("%s: %s\n",k,v)


    //Tuples
    var tuple  = (102, "Bamzmy", 12.0)
    printf("%s owes us %.2f dollars\n",tuple._2,tuple._3)
    tuple.productIterator.foreach{i=> print(i+" ")}
  }
}