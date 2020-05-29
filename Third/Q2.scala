package Third

object Q2 extends App {
  
  primeSeq(10);
  
  def primeSeq(n:Int):Any={
    if(n>1){
      
      primeSeq(n-1);
      prime(n);
     
    
    }   
    
  }
  
  def gcd(a:Int,b:Int):Int=b match{
    
    case 0 =>a;
    case b if b>a =>gcd(b,a);
    case _ =>gcd(b,a%b);
  }
  
  def prime(p:Int,n:Int=2):Any=n match{
    
    case x if(x==p)=>print(p+",");
    case x if gcd(p,x)>1=>0;
    case x=> prime(p,x+1);
  }
  
}