package com.maxjang.kotlin

// 람다함수: 이름이 없어도 함수 역할을 하는 익명함수의 형태
fun main() {
    // 한줄 람다함수
    var c: (String) -> Unit = { str -> println("$str 람다함수") }
    var d = { str: String -> println("$str 람다함수") }

    // 여러줄 람다함수
    var e = { str: String ->
        println("$str 람다함수")
        println("$str 여러구문")
        println("$str 사용가능")
    }

    var calculate = { a: Int, b: Int ->
        println("$a + $b = ${a + b}")
        // 마지막 부분인 a+b 값을 Int로 반환
        a + b
    }

    // 파라미터가 없는 람다함수
    var hello = { println("파라미터가 없는 람다함수") }

    // 파라미터가 하나인 람다함수
    // it으로 대체하여 사용가능
    var one: (String) -> Unit = { println("$it 람다함수") }


}
