package cn.bugkit.serialization.controller;

import cn.bugkit.serialization.components.HttpResponse;
import cn.bugkit.serialization.components.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bugkit
 * @since 2022.2.25
 */
@RestController
public class EnumController {

    /**
     * 入参的result字段是 -1 - fail，结果是0 - success
     * @param response
     * @return
     */
    @PostMapping("test")
    public HttpResponse testSerialize(@RequestBody HttpResponse response) {
        System.out.println(response);
        return new HttpResponse(Result.SUCCESS, null);
    }

}
