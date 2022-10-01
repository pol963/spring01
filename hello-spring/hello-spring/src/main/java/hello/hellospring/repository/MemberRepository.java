package hello.hellospring.repository;



import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

/*DB에 접근,도메인 객체를 DB에 저장하고 관리를 위한 인터페이스 구현. 아직 저장소를 고민중인상황.*/
public interface MemberRepository {

    /*4가지 기능 구현.*/
    Member save(Member member); /*save 메서드 -> 회원정보 저장소에저장 */
    Optional<Member> findById(Long id); /*Optional -> null  id로 찾아올 수 있습니다.*/
    Optional<Member> findByName(String name); /*Optional -> null name로 찾아올 수 있습니다. */
    List<Member> findAll(); /*모든 회원리스트 반환.*/



}
