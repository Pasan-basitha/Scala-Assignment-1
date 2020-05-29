package Third

object Q4 extends App {
  
  println(isEven(4));
  println(isOdd(5));
  println(isEven(9));
  
  def isEven(n:Int):Boolean=n match{
    
    case 0=> true;
    case _ =>isOdd(n-1);
  }
  
  def isOdd(n:Int):Boolean= !(isEven(n));
  
}