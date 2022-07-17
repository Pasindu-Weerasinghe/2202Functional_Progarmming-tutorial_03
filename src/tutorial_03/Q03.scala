package tutorial_03

object Q03 {
  def main(args:Array[String]){
    println(volumeofsphere(5))
  }
  
  def volumeofsphere(r:Double):Double={
    var vol=4/3*math.Pi*r*r*r
    return vol
  }
}