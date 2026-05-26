package com.university.clubbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    // 就改这里！
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/test/db")
    public List<Map<String, Object>> testDb() {
        String sql = "SELECT * FROM t_student LIMIT 5";
        return jdbcTemplate.queryForList(sql);
    }
}