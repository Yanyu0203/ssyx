package org.yyy.ssyx.acl.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.yyy.ssyx.common.result.Result;

import java.util.HashMap;
import java.util.Map;

@Api(tags = "Login API")
@RestController
@RequestMapping("/admin/acl/index")
@CrossOrigin
public class IndexController {

    //login
    @ApiOperation("Log In")
    @PostMapping("login")
    public Result login() {
        Map<String, String> map = new HashMap<>();
        map.put("token", "token-admin");
        return Result.ok(map);
    }

    //getInfo
    @ApiOperation("Get Information")
    @GetMapping("info")
    public Result info() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "admin");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return Result.ok(map);
    }

    //logout
    @ApiOperation("Log Out")
    @PostMapping("logout")
    public Result logout() {
        return Result.ok(null);
    }
}
