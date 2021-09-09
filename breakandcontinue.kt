fun main(args : Array<String>){
    
for(i in 1..5){
    if(i == 3){
        break;
    }
    print(i)
} 
    
    println()
    for (i1 in 1..3) {  
    for (j1 in 1..3) {  
        println("$i1 and $j1")  
        if (i1 == 2) {  
            continue  
        }  
        println("below if")  
    }  
 }  
}

