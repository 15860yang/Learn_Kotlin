package Day_03_07印章类

/**
 *
 * 印章类的主要作用就是当子类的数量是有限的时候可以去创建印章类
 */
fun main(args: Array<String>) {
    var a01 = aaaa.aaa01()
    var a02 = aaaa.aaa02()
    var a03 = aaaa.aaa01()
    var a04 = aaaa.aaa02()
    var a05 = aaaa.aaa01()
    var a06 = aaaa.aaa02()

    var list = listOf<aaaa>(a01,a02,a03,a04,a05,a06)
    for (l in list){
        if(l is aaaa.aaa01)
            l.sayhello()
    }
}