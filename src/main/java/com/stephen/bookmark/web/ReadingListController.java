package com.stephen.bookmark.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stephen.zhang on 2018/5/18.
 */
@RestController
public class ReadingListController {

    @GetMapping("/")
    public String test() {
        return "true";
    }
}
