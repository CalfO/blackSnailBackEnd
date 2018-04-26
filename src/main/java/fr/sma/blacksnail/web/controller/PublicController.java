package fr.sma.blacksnail.web.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PublicController {

	@ResponseBody
	@GetMapping(value = "/hello")
	@ApiOperation(value = "Hello world for example", response = String.class)
	@ApiResponses({
			@ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 403, message = "Invalid Partner Security Token"),
			@ApiResponse(code = 500, message = "Internal Server Error")
	})
	String hello() {
		return "Hello World!";
	}
}
