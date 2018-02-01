package Day_04_02继承补充

/**
 * 如果一个类要被继承，可以使用 open 关键字进行修饰。
 *
 * 如果子类有主构造函数， 则基类必须在主构造函数中立即初始化。
 *
 */
open class Person(var name : String, var age : Int){// 基类

}

class Student(name : String, age : Int, var no : String, var score : Int) : Person(name, age) {

}


/**
    如果子类没有主构造函数，则必须在每一个二级构造函数中用 super 关键字初始化基类，
    或者在代理另一个构造函数。初始化基类时，可以调用基类的不同构造方法。
 */

/**用户基类**/
open class Person1(name:String){
    /**次级构造函数**/
    constructor(name:String,age:Int):this(name){
        //初始化
        println("-------基类次级构造函数---------")
    }
}

/**子类继承 Person 类**/
class Student1:Person1{

    /**次级构造函数**/
    constructor(name:String,age:Int,no:String,score:Int):super(name,age){
        println("-------继承类次级构造函数---------")
        println("学生名： ${name}")
        println("年龄： ${age}")
        println("学生号： ${no}")
        println("成绩： ${score}")
    }
}

/**
 *
 * 如果有多个相同的方法（继承或者实现自其他类，如A、B类），
 * 则必须要重写该方法，使用super范型去选择性地调用父类的实现
 *
 */
open class A {
    open fun f () { print("A") }
    fun a() { print("a") }
}

interface B {
    fun f() { print("B") } //接口的成员变量默认是 open 的
    fun b() { print("b") }
}

class C() : A() , B{
    override fun f() {
        super<A>.f()//调用 A.f()
        super<B>.f()//调用 B.f()
    }
}

fun main(args: Array<String>) {
    val c =  C()
    c.f()

}
