package translate.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import translate.demo.service.Exchange;

import javax.security.auth.message.callback.PrivateKeyCallback;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpResponse;


@Api(description = "数据字典接口")
@Controller
@RequestMapping("/admin")
public class enable {

    @Autowired
    Exchange exchange;
    @ApiOperation("测试api")
    @PostMapping("/find")

    public HttpServletResponse post(@RequestBody String text, HttpServletResponse response){

        String aft = exchange.fiveEx(text);

        



        return null;


    }
}
