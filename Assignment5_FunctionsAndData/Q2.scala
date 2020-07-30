package Assignment5_FunctionsAndData

object Q2 extends App {
  
   class Rational(n:Int,d:Int){
  
   require(d>0,"Denominator must be greater than 0");
   
   def -(r:Rational)=new Rational(this.numer*r.denom-this.denom*r.numer,this.denom*r.denom);
   
   private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b);
   
  def numer=n/gcd(n,d);
  def denom=d/gcd(n,d);
  

  
  
  override def toString= numer+"/"+denom;
  
}


  
   val r1= new Rational(10,4);
  val r2= new Rational(20,9);
  val r3= new Rational(10,7);
  
  println(r1);
  println(r2);
  println(r3);
  
  val x=r1-r2-r3;
  println(x);
}

