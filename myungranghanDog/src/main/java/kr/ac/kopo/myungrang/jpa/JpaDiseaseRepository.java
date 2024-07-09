package kr.ac.kopo.myungrang.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.myungrang.vo.DiseaseVO;

@Repository
public interface JpaDiseaseRepository extends JpaRepository<DiseaseVO, String>{

}
