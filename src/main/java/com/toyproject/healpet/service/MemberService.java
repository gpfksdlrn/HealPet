package com.toyproject.healpet.service;

import com.toyproject.healpet.common.ApplicationContextProvider;
import com.toyproject.healpet.controller.MemberController;
import com.toyproject.healpet.dao.MemberDao;
import com.toyproject.healpet.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberService {

    private final Logger logger = LoggerFactory.getLogger(MemberController.class);

   private final MemberDao memberDao;

    public MemberVO memberList() throws Exception{
        MemberVO vo = new MemberVO();

        try {
            vo = memberDao.selectMember();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return vo;
    }
}
