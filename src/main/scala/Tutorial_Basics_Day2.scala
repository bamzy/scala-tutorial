

object Tutorial_Basics_Day2{

  def main(args: Array[String])
  {

  }
  class Animal(var name: String, var sound: String ){
    this.setName(name)
    val id = Animal.newIdNum
    def getName() : String = name
    def getSound() : String = sound
    def setName(name: String): Unit = {
      if(!(name.matches(".*\\d+.*")))
        this.name = name
      else
        this.name = "No Name"
    }
    def setSound(sound: String): Unit = {
      this.sound = sound
    }
  }
    object Animal{
      private var idNumber = 0
      private def newIdNum = {idNumber+=1; idNumber}

    }
}