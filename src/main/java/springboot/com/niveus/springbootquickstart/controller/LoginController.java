package springboot.com.niveus.springbootquickstart.controller;

import springboot.com.niveus.springbootquickstart.service.LoginService;
import springboot.com.niveus.springbootquickstart.util.RestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public RestResponse<Object> login(String username, String password) {
        loginService.login(username, password);
        return RestResponse.ok();
    }
}
