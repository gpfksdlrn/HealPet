package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class WishVO {
    private int wishSeq;    // 관심 상품 일련번호
    private int itemSeq;    // 상품 일련번호
    private int memberSeq;  // 회원 일련번호
    private String regDt;   // 등록 날짜
    private String useYn;   // 사용여부
}
