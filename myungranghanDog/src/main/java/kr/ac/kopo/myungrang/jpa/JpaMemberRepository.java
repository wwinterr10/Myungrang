package kr.ac.kopo.myungrang.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.myungrang.vo.MemberVO;

@Repository
public interface JpaMemberRepository extends JpaRepository<MemberVO, String>{
	@Query(value="insert into member(id, password, name, birth_date, phone, post, basic_addr, detail_addr, email)"
			+ "values()", nativeQuery=true)
	public void join(MemberVO member);
	
	public Optional<MemberVO> findById(String id);
}








