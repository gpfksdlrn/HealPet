package com.toyproject.healpet.repository;

import com.toyproject.healpet.entity.HealPetMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<HealPetMember,Integer> {

    List<HealPetMember> findAllByUseYn (String type);

    Optional<HealPetMember> findByMemberName (String name);

}
