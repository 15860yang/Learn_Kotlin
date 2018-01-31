package Day_03_03抽象类和接口

/**
 *
 * 新增关键字  is   查看是否是子类或者接口实现类
 */
fun main(args: Array<String>) {
    var man = worker("小明",18)
    man.speak()
    man.work()
    man.setname("小花")
    man.work()
    println(man is human)  //结果为true
    println(man is Imen) //结果为true
}