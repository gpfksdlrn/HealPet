package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PaymentVO {
    private int paymentSeq; // 구매정보 일련번호
    private int itemSeq;    // 상품 일련번호
    private int memberSeq;  // 회원 일련번호
    private int buyPrice;   // 상품 가격
    private int orderNo;    // 상품 주문번호
    private String regDt;   // 상품 구매 날짜
}
