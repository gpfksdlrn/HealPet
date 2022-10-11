package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BoardVO {
    private int boardSeq;
    private String boardType;
    private String boardTitle;
    private String boardContent;
    private int memberSeq;
    private String redDt;
    private String updDt;
    private String useYn;
    private String popupYn;
    private String popupStartDt;
    private String popupEndDt;
}
