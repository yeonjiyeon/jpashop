package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable// jpa내장타입이라는 것을 명시한다
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;
}
