package com.maxjang.kotlin

// 변수 선언 및 Nullable
fun main() {
    // var: 읽기 쓰기가 가능한 변수
    var variable: Int = 123
    println(variable)

    // val: 선언 이후에는 중간에 값을 변경할 수 없는 변수
    val value: Int = 456
    println(value)

    // ?(Nullable): NullSafe 해제 -> NPE 가능성이 있음
    var nullableVariable: Int? = null
    println(nullableVariable)

    // ${var}(String Template): 문자열 안에 외부 변수를 삽입가능
    var singleLineString = "Variable 의 값은 $variable 입니다.";
    println(singleLineString)

    // """: 줄바꿈이나 특수문자까지 문자열로 사용가능
    var multiLineString = """
        Hello,
        I'm Max Jang
        from Korea.
    """
    println(multiLineString)
}