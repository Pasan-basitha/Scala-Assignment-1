package Assignment4

object ceaserCipher extends App {
  
  //string Alphabet
  val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
  //Encrypt function
  val en=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
  
  //Decrypt function
  val de=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size)
  
  //MAp reduce function
  val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
  
  //string
  var s="abegxyz"
  
  val ct=cipher(en,s,5,alphabet)
  val cp=cipher(de,ct,5,alphabet)
  
  println(ct) 
  println(cp) 
}