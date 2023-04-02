case class MyClass(){
  def input()={
    println("enter two numbers")
    val a=scala.io.StdIn.readInt()
    val b=scala.io.StdIn.readInt()
    (a,b)
  }
}