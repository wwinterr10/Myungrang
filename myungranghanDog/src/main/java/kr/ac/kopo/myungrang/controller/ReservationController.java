package kr.ac.kopo.myungrang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.kopo.myungrang.jpa.JpaReservationRepository;

@Controller
public class ReservationController {
	@Autowired
	JpaReservationRepository jpaReservation;
	
	@RequestMapping(value="/reservation")
	public ModelAndView mainView() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("reservation");
		return mav;
	}
}
