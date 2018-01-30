package Day_02

/**
 * kotlin默认参数和具名参数
 */
val pi : Float = 3.14f

//fun main(args: Array<String>) {
//
//    getS(lenth = 5f)
//    getS(4f, 5f)
//
//    println(getsdatafromkeyboard1())
//
//    println(getsdatafromkeyboard2())
//}

/**
 * 其中PI的值是默认给定的，在调用的时候就可以不用赋值，直接显式给第二个参数赋值，称具名参数
 */
fun getS(PI : Float = pi, lenth:Float){
    println(PI * lenth )
}

/**
 * readline()表示从键盘获取一个字符串
 * 在返回值类型后面加问号表示可以返回空
 * 在return后面加！！表示我一定不会输入空
 */
fun getsdatafromkeyboard1():String?{
    print("请输入任意数据：")
    return readLine()
}
fun getsdatafromkeyboard2():String{
    print("请输入任意数据：")
    return readLine()!!
}