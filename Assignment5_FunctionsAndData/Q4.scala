package Assignment5_FunctionsAndData

object Q4 extends App {
  
  class Account(id:String,n: Int, b: Double) {
    
val nic:String=id
val acnumber: Int = n
var balance: Double = b

override def toString ="["+nic+":"+acnumber +":"+ balance+"]"

}
  
   var acc1=new Account("973310526",874,1500.0)
  var acc2=new Account("973310527",875,2000.0)
  var acc3=new Account("973310529",876,-500.0)
  var acc4=new Account("973310524",878,-200.0)
  
var bank:List[Account]=List(acc1,acc2,acc3,acc4)

//val negative=
  

val find=(acc:List[Account])=>acc.filter(x=>(x.balance<0));


val sum=(acc:List[Account])=>acc.reduce((x,y)=>new Account("",0,x.balance+y.balance));

 val interest = (acc: List[Account]) =>acc.map((x) => {
      if (x.balance >= 0) x.balance = x.balance * 1.1
      else x.balance = x.balance * 1.05
      
    })






println(find(bank))
println(sum(bank))


  
}