class Data{
    
    var name : String ?= null
    var age : Int ?= null 
    
    fun message()
    {
        println("this is from simple function")
    }
    fun display(f_name:String,f_age:Int){
        name = f_name
        age = f_age
        println("with argument function")
        println(name)
        println(age)
    }
    
    fun square(number:Int):Int{
        println("return function")
        return number * 2
    }
    
    
    fun show(d :String) = d +" expression"
    fun plus(x: Int) = x * 2

    
}
fun main(args: Array<String>)
{
    var obj = Data()
    obj.message()
    obj.display("arpit",20)
    println(obj.square(2))
    println(obj.show("singel"))
    println(obj.plus(2))
    
}
