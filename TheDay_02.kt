/**
 * kotlin默认参数和具名参数
 */
val pi : Float = 3.14f

fun main(args: Array<String>) {

    var a = { c:Int , b : Int -> c+b}
    var c : (Int ,Int )->Int  = {x,y -> (x+y)}
    var n = a(12,2)
}


fun getS(PI : Float = pi,lenth:Float){
    println(PI * lenth )
}