package br.com.mgckdev.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")
public class UserController {

  /** 
   * TIPOS DE DADOS
   * String (Texto)
   * Interger (int) números inteiros
   * Double (double) números fracionados 0.00000
   * Float (float) números 0.00
   * char (A C)
   * Date (data)
   * void
   */
  @PostMapping("/")
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.name);
  }
}
