object third extends App{
  def discount(x:Int):Double ={
    var newprice : Double =0;
    newprice=x*(24.95-(24.95*0.4));
    return newprice;
  }
  def shippingcost(x:Int):Double ={
    var amount : Double=0;
    if(x<=50){
      amount=3;
    }else{
      amount= 3+(0.75*(x-50));
    }
    return amount;
  }
  def total(x:Int)=discount(x)+shippingcost(x);
  println(total(60));
}
