package io.incm.cicdpipeline.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;

/**
 * @author adamygysarme
 * @version 1.0
 * @since 10/29/2023
 */
@RestController
@RequestMapping(path = "/test")
public class TestController {

    @GetMapping
    public ResponseEntity<Map<String, String>> test() {
        return ResponseEntity.ok().body(of("Testing", "Up and running", "time", now().toString()));
    }

}
