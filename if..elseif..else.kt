class Data
{
    var n1 = 10
    var n2 = 20
    
    fun setData(){
   
        if(n1 > n2)
        {
            println("no 1 is big")
        }
        else if (n1 == n2)
        {
            println("no is equal")
        }
        else
        {
            println("no 2 is big")
        }
        
    }
    
}
fun main(args : Array<String>){
    
    var obj = Data()
	obj.setData()
    
   
}
