package Assignment5_FunctionsAndData

object Q1 extends App {
  
  
  val r1= new Rational(3,4);
  val r2= new Rational(6,9);
  
  println(r1.negative);
  println(r2.negative);
  
}

 

class Rational(n:Int,d:Int){
  
   require(d>0,"Denominator must be greater than 0");
   
   private def gcd(a:Int,b:Int):Int=if(b==0) a else gcd(b,a%b);
   
  def numer=n/gcd(n,d);
  def denom=d/gcd(n,d);
  
  def negative=new Rational(-this.numer,this.denom);
  
  
  override def toString= numer+"/"+denom;
  
}

