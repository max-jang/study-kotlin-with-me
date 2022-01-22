package com.maxjang.kotlin

// 반복문
fun main() {
    // for 반복문
    // i가 0부터 9 이내에 동작
    for (i in 0..9) {
        print(i)
    }

    println()

    // step: 2씩 증가
    for (i in 0..9 step 2) {
        print(i)
    }

    // i가 9에서 0까지 1씩 감소하면서 동작
    for (i in 9 downTo 0) {
        print(i)
    }

    println()

    // 문자도 가능
    for (i in 'a'..'z') {
        print(i)
    }

    println()

    // label: 표현식 앞에 label을 달아 jump 가능
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 1 && j == 2) break@loop
            println("i: $i, j: $j")
        }
    }

}

