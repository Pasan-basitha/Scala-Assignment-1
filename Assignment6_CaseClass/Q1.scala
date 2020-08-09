package Assignment6_CaseClass

object Q1 extends App {
  
  val p1=Point(3,5)
  val p2=Point(1,9)
  val p3=p1.move(2,7)
  val p4=p1+p2
  val p5=p1.distance(p2)
  val p6=p2.invert(p2)
  
  println(p1)
  println(p2)
  println("Add=="+p4)
  println("Move=="+p3)
  println("Distance=="+p5)
  println("Invert=="+p6)
 
  
  
}

case class Point(a:Int,b:Int){
  
  def x:Int=a;
  def y:Int=b;
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
  
  def distance(that:Point):Double={
    
    Math.sqrt(Math.pow(this.x-that.x,2)+Math.pow(this.y-that.y,2))
  }
  
  def invert(that:Point)=Point(this.y,this.x)
  
  
}