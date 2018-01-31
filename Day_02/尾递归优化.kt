package Day_02

/**
 * kotlin所做的尾递归优化
 * 适用于递归层数非常大的情况下
 * 但是递归的返回只能返回函数本身
 */
//fun main(args: Array<String>) {
//
//    var result = 0
//    println(getdata(100000,result))
//}
tailrec fun getdata(num:Int ,result : Int ):Int{
    if(num == 0){
        println("result = $result")
        return 1
    }else{
        return getdata(num-1,result + num)
    }
}