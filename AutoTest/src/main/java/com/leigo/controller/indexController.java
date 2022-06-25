package com.leigo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    final static String htmlStr3 = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "<title>Page Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<h1>GoodNigh!</h1>\n" +
            "<p>wish u have a sweet dream ~</p><img src=\"/bitcoin.jpg\" alt=\"Buy bitcoin\" width=\"600\" height=\"181\">\n" +
            "\n" +
            "</body>\n" +
            "</html>";


    @GetMapping("/bitcoin")
    public String getBitcoin() {
        return htmlStr3;
    }


    @GetMapping("/metric")
    public String getMetric(String name) {
        return "Your name = " + name;
    }

    @PostMapping("/upload")
    public String upload(String file) {
        return "";
    }
}
