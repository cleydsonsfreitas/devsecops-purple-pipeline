package com.fatec.devsecops.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @GetMapping("/users/vulnerable")
    public List<Map<String, Object>> getVulnerableUser(@RequestParam String id) {
        logger.warn("ALERTA: Tentativa de acesso ao endpoint INSEGURO com ID: {}", id);
        String sql = "SELECT * FROM users WHERE id = " + id;
        return jdbcTemplate.queryForList(sql);
    }


    @GetMapping("/users/safe")
    public List<Map<String, Object>> getSafeUser(@RequestParam String id) {
        logger.info("LOG: Acesso seguro processado.");
        String sql = "SELECT * FROM users WHERE id = ?";
        return jdbcTemplate.queryForList(sql, id);
    }
}