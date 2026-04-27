package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * Controller propositalmente vulnerável para testes de Purple Team.
 * Este endpoint simula uma falha de SQL Injection.
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/users")
    public List<Map<String, Object>> getUser(@RequestParam String id) {
        // VULNERABILIDADE: Concatenação direta de entrada de usuário na query.
        // Isso permite que o SQLmap realize a exfiltração de dados no banco H2.
        String sql = "SELECT * FROM users WHERE id = " + id;

        // BLUE TEAM: O log gerado aqui será capturado devido à configuração no application.properties
        return jdbcTemplate.queryForList(sql);
    }
}