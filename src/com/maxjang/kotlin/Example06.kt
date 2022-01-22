package com.maxjang.kotlin

// 클래스 및 생성자
fun main() {
    var a = Person("이태민", 1993)
    var b = Person("최민호")
    var c = Person("김기범")
}

// 클래스 속성 선언과 동시에 생성자 생성
// var/val 표기하지 않을 시 dafault로 val로 선언
class Person(var name: String, val birthYear: Int) {

    // init: 파라미터나 반환값이 없는 기본생성자 함수
    // 초기화 시 코드를 추가하여 유효성 검사 등 기능을 추가
    init {
        println("안녕하세요, ${birthYear}년에 태어난 ${name}입니다.")
    }

    // constructor: 인스턴트 생성시 추가적인 구문을 수행하는 보조생성자
    // 반드시 기본생성자를 통해 속성을 초기화를 해야함
    // 기본 생성자 생성 후 보조생성자가 생성됨
    constructor(name: String) : this(name, 1991) {
        println("보조생성자가 사용되었습니다.")
    }
}

// 클래스 생성자에 초기값을 이런식으로 지정도 가능
class Person2(var name: String = "이름없음", var age: Int) {

}




