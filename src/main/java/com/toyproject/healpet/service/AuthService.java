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

    public MemberVO memberList() throws Exception{
        MemberVO vo = new MemberVO();

        try {
            vo = memberDao.selectMember();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return vo;
    }

    @Transactional
    public Object getMemberJpa() throws Exception {
        List<HealPetMember> member = null;

        try {
            member = memberRepository.findAllByUseYn("Y");
        } catch (Exception e) {
            e.printStackTrace();
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
            res.put("body",new HashMap<>());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }
}
