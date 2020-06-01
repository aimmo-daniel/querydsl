package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {

    List<Member> findByUsername(String username);


    //QuerydslPredicateExecutor<Entity>
    /**
     * 한계점 : 조인 X
     * 실무에서 사용하기에는 한계가 명확하다
     */

}
