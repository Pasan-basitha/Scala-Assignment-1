package second

object Q2  extends App {
  
  println("Profit is="+profit(5));
   println("Profit is="+profit(10));
    println("Profit is="+profit(15));
     println("Profit is="+profit(20));
      println("Profit is="+profit(25));
       println("Profit is="+profit(30));
        println("Profit is="+profit(35));
  
  def attend(p:Int):Int={
    
    val a:Int=120+((15-p)/5)*20;
    return a;
  }
  
  def revenue(p:Int):Int={
    
    val r:Int=p*attend(p);
    return r;
  }
  
  def cost(p:Int):Int={
    val c:Int=500+3*attend(p);
    return c;
    
  }
  
  def profit(p:Int):Int={
    
    val pro:Int=revenue(p)-cost(p);
    return pro;
  }
  
}