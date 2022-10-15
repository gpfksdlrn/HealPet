package com.toyproject.healpet.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PetVO {
    private int petSeq;             // 반려동물 일련번호
    private int memberSeq;          // 회원 일련번호
    private String petName;         // 반려동물 이름
    private String petSex;          // 반려동물 성별
    private String petBirth;        // 반려동물 생일
    private String petBreed;        // 반려동물 종류
    private String petWeight;       // 반려동물 몸무게
    private String petNevteringYn;  // 중성화 여부
    private String petNevteringDt;  // 중성화 날짜
}
