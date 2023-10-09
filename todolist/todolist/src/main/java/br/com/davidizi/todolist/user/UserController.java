package br.com.davidizi.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {
    
    
    /**
     * String(texto)
     * Interger(inteiros)
     * Double(numeros de virgulas)
     * Float(0.000)
     * char(A C)
     * Date (data)
     * void
     *
     * 
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}
