package com.dev.blog.controllers;


import com.dev.blog.constants.ResponseConst;
import com.dev.blog.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
public class BasicController {
    @GetMapping
    public ResponseEntity<ApiResponse<String>> checkHealth() {
        ApiResponse<String> response = new ApiResponse<>(
                ResponseConst.STATUS_OK,
                ResponseConst.HEALTH_CHECK_STATUS_UP,
                null
        );
        return ResponseEntity.ok(response);
    }
}
