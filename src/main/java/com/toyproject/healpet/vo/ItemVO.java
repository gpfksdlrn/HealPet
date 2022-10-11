package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ItemVO {
    private int itemSeq;
    private String itemName;
    private int itemPrice;
    private String itemShowStartDt;
    private String itemShowEndDt;
    private int itemTargetPrice;
    private int itemTotalPrice;
    private String regDt;
    private String updDt;
    private String useYn;
}
