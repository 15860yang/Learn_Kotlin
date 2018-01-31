package Day_03_02抽象类和继承

/**
 * 猫继承动物抽象类，名字向上传递到动物的构造器参数名字
 */
class cat(name:String):animal(name){
    override fun speak() {
        println("$name 喵喵叫...")
    }
}