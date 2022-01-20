package com.maxjang.kotlin

/***
 * 함수
 * Kotlin 에서 함수는 내부적으로 기능을 가진 형태이지만,
 * 외부에서 볼 때는 파라미터를 넣는 것 외에는
 * 자료형이 결정된 변수라는 개념으로 접근
 * -> 함수형 언어 특징
 */
fun main() {
    println(add(1, 2, 3))
    println(addSingleExp(4, 5, 6))
}

// 함수 생성 (return type 필수)
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

// 단일함수 생성 (타입추론으로 return type 생략)
fun addSingleExp(a: Int, b: Int, c: Int) = a + b + c