package com.toyproject.healpet.dao;

import com.toyproject.healpet.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MemberDao {
     MemberVO selectMember() throws Exception;
}
