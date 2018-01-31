package Day_03_03抽象类和接口


/**
 * 继承抽象父类和实现功能接口
 * 子类的构造方法中的变量只有在父类中声明才能够使用
 * 但子类构造器中新增的变量不可以直接使用，但可以通过子类成员变量接受使用
 */
class worker(name:String,age:Int):human(name),Imen{
    override fun speak() {
        println("$name 说了一句话...")
    }

    var ss = age
    override fun work() {
        println("$ss  $name 工作赚钱养家...")
    }

    fun setname(newname:String){
        name = newname
    }
}