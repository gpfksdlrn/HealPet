package com.toyproject.healpet.service;

import com.toyproject.healpet.controller.AuthController;
import com.toyproject.healpet.dao.MemberDao;
import com.toyproject.healpet.entity.HealPetMember;
import com.toyproject.healpet.repository.MemberRepository;
import com.toyproject.healpet.request.MemberAddRequest;
import com.toyproject.healpet.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthService {

    private final Logger logger = LoggerFactory.getLogger(AuthController.class);

   private final MemberDao memberDao;
   private final MemberRepository memberRepository;

    @Transactional
    public Object getMember() throws Exception {
        List<HealPetMember> member = null;

        try {
            member = memberRepository.findAllByUseYn("Y");
            logger.info("멤버정보:{}",member);

            if(member.isEmpty()) {
                logger.error("멤버정보가 조회되지 않습니다.");
            }


        } catch (Exception e) {
            e.printStackTrace();
            logger.error("멤버 정보 조회 실패:{}",e.toString());
        }

        return member;
    }

    @Transactional
    public Object addMember(MemberAddRequest memberAddRequest) throws Exception {
        Map<String , Object> res = new HashMap<>();

        try {

            HealPetMember save = memberRepository.save(HealPetMember.builder()
                    .memberId(memberAddRequest.getMemberId())
                    .memberPw(memberAddRequest.getMemberPw())
                    .memberName(memberAddRequest.getMemberName())
                    .memberSex(memberAddRequest.getMemberSex())
                    .memberBirth(memberAddRequest.getMemberBirth())
                    .memberAddressPost(memberAddRequest.getMemberAddressPost())
                    .memberAddress(memberAddRequest.getMemberAddress())
                    .memberPhone(memberAddRequest.getMemberPhone())
                    .regDt(LocalDateTime.now())
                    .updDt(LocalDateTime.now())
                    .memberMarketingYn(memberAddRequest.getMemberMarketingYn())
                    .useYn("Y")
                    .build());

            res.put("code","SS1000001");
            res.put("message","성공");

            logger.info("멤버생성 성공 멤버정보:{}",save);

            res.put("body",new HashMap<>());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }
}
