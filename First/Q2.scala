package First

object Q2 extends App {
  
  println("volume of a sphere with radius 5 is="+ volume(5));
  
   def volume(r:Double):Double={
      
      val z:Double=4.0/3.0*math.Pi*r*r*r;
      return z;
      
    }
  
}