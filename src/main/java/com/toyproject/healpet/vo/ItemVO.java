package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ItemVO {
    private int itemSeq;            // 상품 일련번호
    private String itemName;        // 상품명
    private int itemPrice;          // 상품 가격
    private String itemShowStartDt; // 상품 표시 시작 날짜
    private String itemShowEndDt;   // 상품 표시 종료 날짜
    private int itemTargetPrice;    // 목표 금액
    private int itemTotalPrice;     // 달성 금액
    private String regDt;           // 등록 날짜
    private String updDt;           // 수정 날짜
    private String useYn;           // 사용 여부
}
