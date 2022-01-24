package com.maxjang.kotlin

// 스코프함수
fun main() {

    // apply: 인스턴스 생성 시 apply를 사용하여 람다 함수 내에서
    // apply scope 안에서 인스턴스 속성과 함수를 사용하여 가공
    // apply 의 return은 인스턴스 자신
    var a = Book("자바 개발자를 위한 97가지 제안", 10000).apply {
        name = "[초특가] ${name}"
        discount(price)
    }
    println(a)

    // run: apply와 비슷하지만 마지막 구문을 반환
    // 이미 인스턴스를 만들고 속성이나 함수를 사용해야할 때 사용
    var b = a.run {
        println("상품명: ${name}, 가격: ${price}원")
        ("상품명: ${name}, 가격: ${price}원")
    }

    // with: run과 기능은 똑같지만 참조연산자가 아닌 with에 파라미터로 넘겨줌
    var c = with(a) {
        println("상품명: ${name}, 가격: ${price}원")
        ("상품명: ${name}, 가격: ${price}원")
    }

    var price = 5000

    // let: run과 같지만 run이 속해있는 main 함수의 동일한 이름의 변수 대신
    // 인스턴스 내에 속성을 사용하기 위해 사용
    // it을 사용하여 인스턴스 내 속성을 사용
    var d = a.let {
        println("상품명: ${it.name}, 가격: ${it.price}원")
        ("상품명: ${it.name}, 가격: ${it.price}원")
    }
}

class Book(var name: String, var price: Int) {
    fun discount(price: Int): Int {
        return price - 2000
    }

    override fun toString(): String {
        return "Book(name='$name', price=$price)"
    }


}
