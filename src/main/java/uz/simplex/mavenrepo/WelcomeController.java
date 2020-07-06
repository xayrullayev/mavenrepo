package uz.simplex.mavenrepo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class WelcomeController {

  @GetMapping("/hi")
  public String welcome() {
    return "<h1 align='center'>Hi welcome to my site</h1>";
  }

  @GetMapping("/error")
  public ResponseEntity error() {
    return ResponseEntity.ok().build();
  }
}
