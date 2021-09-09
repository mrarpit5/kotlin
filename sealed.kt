sealed class Demo{
    
    class One : Demo(){
        fun display()
        {
            println("from 1")
        }
    }
    class Second : Demo(){
        fun display(){
            println("from 2")
        }
    }
}

fun main(){
    
    val obj1 = Demo.One()
    obj1.display()
    
    val obj2 = Demo.Second()
    obj2.display()
}
