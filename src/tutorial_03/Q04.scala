package tutorial_03

object Q04 {
  def main(args:Array[String]){
    println(bookPrice(60)-discount(bookPrice(60))+shippingCost(60))
  }
  def bookPrice(nobook:Int):Double={
    nobook*24.95
  }
  def discount(amuont:Double):Double={
    amuont*.4
  }
  def shippingCost(nobook:Int):Double={
    if(nobook>50){
      var price1=50*3+(nobook-50)*0.75
      return price1
    }
    else{
      var price2=nobook*3
      return price2
    }
  }
}