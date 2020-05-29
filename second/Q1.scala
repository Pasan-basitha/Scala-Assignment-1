package second

object Q1 extends App  {
  
  println("Take home salary="+takeHome(24,10));
  
  def normal(h1:Int):Int={
    
    val x:Int=h1*150;
    return x;
  }
  
  def ot(h2:Int):Int={
    
    val y:Int=h2*75;
    return y;
  }
  
  
  def income(h1:Int,h2:Int):Int={
    
    val z:Int=normal(h1)+ot(h2);
    return z;
    
  }
  
  def tax(p:Int):Double={
    
    val t:Double=p*10/100;
    return t;
   
  }
  
  def takeHome(h1:Int,h2:Int):Double={
    
    val th:Double=income(h1,h2)-tax(income(h1,h2));
    return th;
  }
  }