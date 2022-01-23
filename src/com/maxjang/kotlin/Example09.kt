package com.maxjang.kotlin

// 추상화
fun main() {
    var r = Rabbit()
    r.eat()
    r.sniff()

    var d = Puppy()
    d.eat()
    d.run()
}

// abstract 추상 클래스에서는 open 키워드가 생략됨
abstract class Animal3 {
    abstract fun eat()
    fun sniff() {
        println("킁킁")
    }
}

class Rabbit : Animal3() {
    override fun eat() {
        println("당근을 먹습니다.")
    }
}

// 인터페이스에서는 속성, 추상함수, 일반함수를 가질 수 있음
// 인터페이스는 생성자를 가질 수 없음
// 구현부가 있는 함수 -> open 함수로 간주
// 구현부가 없는 함수 -> abstract 함수로 간주
interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다.")
    }
}

class Puppy: Runner, Eater {
    override fun run() {
        println("우다다다 뜁니다.")
    }

    override fun eat() {
        println("허겁지겁 먹습니다.")
    }

}