package Assignment5_FunctionsAndData

object Q3 extends App {
  
  
  var acc1=new Account("973310526",874,1500.0)
  var acc2=new Account("973310527",875,2000.0)
  
  var amnt=500.0
  acc1.transfer(acc2,amnt)
  
  println("Transfer amount is="+amnt)
  println("After the transaction current status of account1:"+acc1)
  println("After the transaction current status of account2:"+acc2)
  
  
class Account(id:String,n: Int, b: Double) {
val nic:String=id
val acnumber: Int = n
var balance: Double = b

override def toString ="["+nic+":"+acnumber +":"+ balance+"]"

def withdraw(a:Double) =this.balance=this.balance-a

def deposit(a:Double) =this.balance=this.balance+a

def transfer(an:Account,ta:Double):Unit={
  this.withdraw(ta)
  an.deposit(ta)
}
 
}
  
}