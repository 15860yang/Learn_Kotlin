package Day_03_04代理和委托

/**
 * 手动控制代理
 * 可以通过代码控制代理的行为时机
 * 所以在手动控制代理中   son().washing()  这句代码是必须的
 *
 */
class father2 :Washing by son01 {
    override fun washing() {
        println("我是好爸爸，我来看儿子洗刷！")
        son01.washing()
    }
}