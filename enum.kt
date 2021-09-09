enum class


enum class Days
{
    
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

fun main(args : Array<String>){
    
    for (d in Days.values()){
        println(d.name)
    }
    println(Days.valueOf("SUNDAY"))
}