package com.maxjang.kotlin

// 클래스 상속
fun main() {
    var a = Animal("콩떡", 5, "개")
    var b = Dog("초코", 9)

    a.introduce()
    b.introduce()

    b.bark()
    var c = Cat("루이", 1)
    c.meow()

}

// 코틀린은 상속 금지가 기본
// open 키워드를 사용하여 클래스를 상속가능으로 변경
open class Animal(var name: String = "", var age: Int, var type: String) {
    fun introduce() {
        println("저는 $type $name 이고, ${age}살 입니다.")
    }
}

// 서브 클래스가 생성될 때 슈퍼클래스 생성자가 함께 호출 되어야함
// var, val을 붙이면 속성으로 선언되므로 파라미터로 넘기기 위해 선언 키워드를 붙이지않음
class Dog(name: String, age: Int) : Animal(name, age, "개") {
    fun bark() {
        println("멍멍")
    }
}

class Cat(name: String, age: Int) : Animal(name, age, "고양이") {
    fun meow() {
        println("야옹")
    }
}

