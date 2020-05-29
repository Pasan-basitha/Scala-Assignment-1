package Third

object Q5 extends App {
  
  println("Sum of even numbers="+addEven(10));
  
  def addEven(n:Int):Int=n match{
    
    case n if n==0 => 0;
    case n if n%2==0 => return  (n-2)+addEven(n-2);
    case _ =>(n-1)+addEven(n-1);
  }
  
}