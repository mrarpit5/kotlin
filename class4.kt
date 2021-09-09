class Data{
    
    var name : String ?= null
    var age : Int ?= null 
    fun display(f_name:String,f_age:Int){
        name = f_name
        age = f_age
        println(name)
        println(age)
    }
}
fun main(args: Array<String>)
{
    var obj = Data()
    obj.display("arpit",20)
}
