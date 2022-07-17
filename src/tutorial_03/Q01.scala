package tutorial_03

object Q01 {
  def main(args:Array[String]){
    println(areaofDisk(5))
  }
  
  def areaofDisk(rad:Double):Double={
    var area=math.Pi*rad*rad
    return area
  }
}