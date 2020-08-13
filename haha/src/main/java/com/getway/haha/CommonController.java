package com.getway.haha;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 类描述 TODO
 *
 * @Auther: jun.shen
 * @Date: 2019/10/15 16:47
 */
@RestController
public class CommonController {

    @RequestMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }
}
