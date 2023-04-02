object core extends App{
  val myClass = MyClass()
  val arithmetic = Arithmetic()
  val (a,b) = myClass.input()
  val res = arithmetic.addition(a,b)
  println("result is "+res)
}