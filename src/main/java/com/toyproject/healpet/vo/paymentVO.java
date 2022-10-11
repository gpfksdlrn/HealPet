package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class paymentVO {
    private int paymentSeq;
    private int itemSeq;
    private int memberSeq;
    private int buyPrice;
    private int orderNo;
    private String regDt;
}
