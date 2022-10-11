package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BoardVO {
    private int boardSeq;           // 게시글 일련번호
    private String boardType;       // 게시글 타입
    private String boardTitle;      // 게시글 제목
    private String boardContent;    // 게시글 내용
    private int memberSeq;          // 회원 일련번호
    private String regDt;           // 게시글 등록날짜
    private String updDt;           // 게시글 수정날짜
    private String useYn;           // 사용여부
    private String popupYn;         // 팝업여부
    private String popupStartDt;    // 팝업 시작날짜
    private String popupEndDt;      // 팝업 종료날짜
}
