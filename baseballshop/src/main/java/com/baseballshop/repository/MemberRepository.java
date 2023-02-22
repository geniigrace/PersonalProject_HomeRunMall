package com.baseballshop.repository;

import com.baseballshop.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository <Member, String> {

    Member findByUserId(String userId);

    Optional<Member> findByEmail(String Email);


}
