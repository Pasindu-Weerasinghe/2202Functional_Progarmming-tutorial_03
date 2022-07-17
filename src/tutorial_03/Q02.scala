package tutorial_03

object Q02 {
  def main(args:Array[String]){
    println(Celciuse(35))
  }
  
  def Celciuse(cel:Double):Double={
    var far=cel*1.8+32
    return far
  }
}