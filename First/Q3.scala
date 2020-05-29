package First

object Q3 extends App{
  
  println("The total wholesale cost for 60 copies="+cost(60));
  
   def cost(n:Int):Double={
      
      val dp:Double=24.95*0.6;
      
      if(n>50){
       
        val ab:Int=n-50;
        val sc2:Double=ab*0.75;
        val tc:Double=dp*n+3.00+sc2;
        return tc;
      }
      
      else{
       val mc:Double=dp*n+3.00;
       return mc;
       
      }
      
    }
  
}