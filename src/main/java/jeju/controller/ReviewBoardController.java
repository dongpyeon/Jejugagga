package jeju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReviewBoardController {

	@GetMapping("/community/review/list")
	public String reviewlist() {
		return "community/review/reviewlist";
	}

	@GetMapping("/community/review/write")
	public String reviewwrite() { return "community/review/reviewwrite"; }


}

