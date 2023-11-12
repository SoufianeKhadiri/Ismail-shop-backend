package com.example.IsmailShopApi.IsmailShopApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/app")

public class TokenController {

    @GetMapping(path = "/test")
    public String test(Principal principal) {
        return principal.getName();
    }
}