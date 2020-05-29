package First

object Q1  extends App {
  
  println("Temperature in Fahrenheit="+tconvert(35));
  
   def tconvert(x:Double):Double={
     
     val y: Double= x*1.8+32;
     return y;
     
    }
}