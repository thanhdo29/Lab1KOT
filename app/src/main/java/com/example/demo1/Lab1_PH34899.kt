package com.example.demo1

fun printMessage(message:String):Unit{
    println(message)
}

fun printMessageWithPrefix(message: String, prefix:String="Info"){
    println("[$prefix] $message")
}

fun sum(x:Int, y:Int):Int{
    return x+y
}

fun multiply(x: Int, y: Int) = x * y

fun main(){

    bai3()
}

fun bai2(){
    print("Đỗ Tuấn Thành - PH34899\n")
    print("=========================\n")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")
}

fun bai3(){
    var a=0.0
    var b=0.0

    println("Nhập a: ")
    var s= readLine()
    if (s!= null) a=s.toDouble()
    s= readLine()
    if (s!= null) b=s.toDouble()
    println("Tổng= "+(a+b))
    println("Hiệu= "+(a-b))
    println("Tích= "+(a*b))
    println("Thương= "+(a/b))
}
fun vd1(){
    println("Hello, World!")
}
fun vd2(){
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}

fun vd3(){
    var a: String = "initial"
    println(a)
    val b: Int = 1
    val c = 3
}



fun vd5(maybeString:String?):String{
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}
