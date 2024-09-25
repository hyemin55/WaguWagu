package com.example.WaguWagu.repository;

import com.example.WaguWagu.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {


}
