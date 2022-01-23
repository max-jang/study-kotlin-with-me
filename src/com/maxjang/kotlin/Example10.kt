package com.maxjang.kotlin

// 고차함수: 다른 함수를 전달인자로 받거나
// 함수실행 결과를 함수로 반환하는 함수
fun main() {
    b(::a)

    // 타입추론으로 함수의 형식을 적지 않고 람다식 안에 파라미터 자료형 기술
    // 파라미터와 반환값 유추가능
    val c = { str: String -> println("$str 람다함수") }
//  val c: (String) -> Unit = { str: String -> println("$str 람다함수") }
    b(c)
}

fun a(str: String) {
    println("$str 함수 a")
}

// 고차함수
// 함수의 타입:
// ex) (Int) -> String  --> Int를 파라미터로 받고 String을 반환
// Unit == void
fun b(function: (String) -> Unit) {
    function("b가 호출한")
}

/***
 * 1. main에서 b에 고차함수 a를 넘긴다.
 * 2. b에서 function 변수로 고차함수 a를 받아 "b가 호출한" 을 넘긴다.
 * 3. a에서는 str 변수로 String을 받아 출력한다.
 */