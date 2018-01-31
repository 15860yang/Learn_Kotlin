package Day_03_02抽象类和继承

/**
 * 狗继承动物抽象类，没有构造器名字，所以向上（父类）的名字传递需要显式指定
 */

class dog():animal(name = "阿花"){

    override fun speak(){
        println("$name 汪汪叫...")
    }
}