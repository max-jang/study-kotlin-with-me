package com.maxjang.kotlin

// 조건문
fun main() {
    ifCondition(5)
    whenCondition(5)
    whenConditionWithReturn(5)
}

// if 조건문
// Any: Kotlin 최상위 Object
// Any?: Nullable이 가능한 최상위 Object

fun ifCondition(a: Any) {
    // is로 type 확인이 가능하며 is not은 !is
    if (a is Int) {
        println("a는 정수입니다.")
    }
}

// when: 하나의 변수를 여러개 값과 비교 (like switch-case)
fun whenCondition(a: Any) {
    when (a) {
        1 -> println("a는 정수 1입니다.")
        is String -> { // 여러줄일때 curly brace 사용가능
            println("a는 문자열 $a 입니다.")
        }
        else -> println("어떤 조건도 만족하지 않습니다.")
    }
}

// return이 있는 when
fun whenConditionWithReturn(a: Any) {
    // 변수에 when return 값 할당
    var result = when (a) {
        1 -> "a는 정수 1입니다."
        is String -> "a는 문자열 $a 입니다."
        else -> "어떤 조건도 만족하지 않습니다."
    }
    println(result)
}