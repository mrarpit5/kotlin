
fun main(args : Array<String>){
    
    val aList = ArrayList<String>()
    aList.add("a")
    aList.add("b")
    aList.add("c")
    
    
    
for(i in aList){
    
    println(i)
} 
    println("index of a is " +aList.size)  
    
    println("index of a is " +aList.indexOf("a"))  

    
    val aNumList = ArrayList<Int>()
    aNumList.add(1)
    aNumList.add(2)
    aNumList.add(3)
    
    for(a in aNumList){
        println(a)
    }
    
    println(aNumList.get(0))
    aNumList.set(2,1)
    
    println(aNumList.get(2))
    aNumList.remove(2)
      
for(a in aNumList){
        println(a)
    }
    
    
}
