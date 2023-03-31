package com.example.sbb;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
@Getter
//@Setter
@RequiredArgsConstructor // fi
public class HelloLombok {

    // Setter version
//    private String hello;
//    private int lombok;

    // RequiredArgsConstructor version
    // final 을 적용했기때문에 @Setter는 의미가 없으며 Setter 메서스들도 사용할수없다.
    // final은 한번설정한값을 변경할수없게 하는키워드 이다.
    private final String hello;
    private final int lombok;

    public static void main(String[] args) {

//        -- Setter version --

//        HelloLombok helloLombok = new HelloLombok();
//        helloLombok.setHello("hello");
//        helloLombok.setLombok(5);
//
//        System.out.println(helloLombok.getHello());
//        System.out.println(hello.getLombok());

        HelloLombok helloLombok = new HelloLombok("하이",5);
        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());

    }

}
