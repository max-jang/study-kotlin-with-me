package com.maxjang.kotlin

// 오버라이딩
fun main() {
    var t = Tiger()
    t.eat()
}

open class Animal2 {
    // open: 서브 클래스에서 오버라이딩 허용
    open fun eat() {
        println("음식을 먹습니다.")
    }
}

class Tiger : Animal2() {
    override fun eat() {
        println("고기를 먹습니다")
    }
}