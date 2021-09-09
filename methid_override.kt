open class Data
{
    var name : String ?= null
    var age : Int ? = null
    
    open fun msg(){
       
    }
}
class Derived:Data()
{
    
    override
    fun msg(){
     println("from derived class")

    }
    
    fun display()
    {
        name = "arpit"
        println(name)
    }
}

class Derived2:Data(){

    override
    fun msg(){
     println("from derived2 class")

    }
    
    fun msg(f_name:String,f_age:Int){
        
        name = f_name
        age = f_age
        println(f_name)
        
    }
}
fun main(args : Array<String>){
    
    var obj = Derived()
    obj.msg()
    obj.display()
    
    var obj2 = Derived2()
    obj2.msg()
    obj2.msg("abcd",11)
}
