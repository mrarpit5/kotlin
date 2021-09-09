open class Data
{
    var name : String ?= null
    var age : Int ? = null
}
class Derived:Data()
{
    fun display()
    {
        name = "arpit"
        println(name)
    }
}

class Derived2:Data(){
    
    fun msg(f_name:String,f_age:Int){
        
        name = f_name
        age = f_age
        println(f_name)
        
    }
}
fun main(args : Array<String>){
    
    var obj = Derived()
    obj.display()
    
    var obj2 = Derived2()
    obj2.msg("abcd",11)
}
