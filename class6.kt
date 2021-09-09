
class Data(name:String,age:Int){
    
    var c_name : String ?= null
    var c_age : Int ?= null 
    init{
       
        c_name = name
        c_age = age
        
        println(c_name)
        println(c_age)
        
    }
    
    
   
    
}
fun main(args: Array<String>)
{
    var obj = Data("arpit",20)
    
}
