package Third

object Q6 extends App {
  
  fibSeq(10);
  
  def fib(n:Int):Int=n match{
    
    case n if n==0=>0;
     case n if n==1=>1;
      case _ =>return fib(n-1)+fib(n-2);
    
  }
  
  def fibSeq(x:Int):Any={
    if(x>0)
    fibSeq(x-1);
    print(","+fib(x));
    
    
  }
}