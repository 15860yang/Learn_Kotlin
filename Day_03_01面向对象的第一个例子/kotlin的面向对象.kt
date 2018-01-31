package Day_03_01面向对象的第一个例子

/**
 * kotlin的类
 * 类名后面跟一个括号，相当于构造方法，用来初始化类数据
 * 类中的成员变量与java相似，成员变量和成员函数的访问权限都可以用private public protect来声明
 */
class Write(var homeWork:String ,var name:String) {
    var isopenhomework = false


    fun openhomework(){
        if(!isopenhomework) {
            println("$name 打开 $homeWork")
            isopenhomework = true
        }
    }
    fun closehomework(){
        if(isopenhomework) {
            println("$name 合上 $homeWork ")
            isopenhomework = false
        }
    }
    fun startWriteHomework(){
        if(isopenhomework){
            println("$name 开始写 $homeWork ...")
            println("$name 写完了！！")
        }else{
            println("请先打开作业本...")
        }

    }
    fun stopwriteHomework(){
        if(isopenhomework){
            println("$name 停止写作业！")
        }
    }

}