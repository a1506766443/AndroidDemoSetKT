package com.derry.s1

// TODO
fun main(args:Array<String>) {

    //？类似广播，村长发出通知说这个name可能是个null，使用者使用时必须采用措施
    var name: String ? = null

    //村民一  使用name
    //TODO 第一种不久措施  name如果真的是null  后面的不执行  就不会引发空指针异常
    name ?.length

    //Todo 第二种补救措施 无论name 是不是null ，都执行。如果为null会引发空指针
    name!!.length

    //todo 第三种补救措施（java一样）
    if (name != null)
        name.length

    //TODO val 可读 不可改
    val name2 :String = "Derry"
    //不可改 会报错
    //  name2 = "derry2"
    //可读
    println("name:$name2")

    //todo 可改可读
    var sex: Char = 'M'

    //可改
    sex = 'A'
    //可读
    println("sex:$sex")

    //todo 使用场景：尽量使用val 如果此变量后续需要变更，则使用var

    //todo类型推断
    val name3 =  "Derry"
    val info  = "111"
    val sex3 = 'c'
    val age = 35

    //函数




}