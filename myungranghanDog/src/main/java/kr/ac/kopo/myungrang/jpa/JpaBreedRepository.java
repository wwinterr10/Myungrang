package kr.ac.kopo.myungrang.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.myungrang.vo.BreedVO;

@Repository
public interface JpaBreedRepository  extends JpaRepository<BreedVO, Integer>{

}
