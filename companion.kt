class Data{
    
    companion object{
        
        fun abcd() = println("static")
        fun demo() = println("companion object")
    }
}

fun main(args : Array<String>){
    
    Data.abcd()
    Data.demo()

    
}
