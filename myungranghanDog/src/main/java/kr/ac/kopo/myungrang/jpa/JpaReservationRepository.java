package kr.ac.kopo.myungrang.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.myungrang.vo.ReservationVO;

@Repository
public interface JpaReservationRepository extends JpaRepository<ReservationVO, Integer> {

}
