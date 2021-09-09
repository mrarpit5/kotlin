open class Base
{
    var variable= 10
}
class Derived:Base()
{
    fun display()
    {
        println(variable*2)
    }
}
fun main(args : Array<String>){
    
    var obj = Derived()
    obj.display()
}