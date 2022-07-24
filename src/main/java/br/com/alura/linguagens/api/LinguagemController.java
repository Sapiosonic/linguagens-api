package br.com.alura.linguagens.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    private List<Linguagem> linguagens =
        List.of(
            new Linguagem("Ruby", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/ruby/ruby_256x256.png", 1),
            new Linguagem("PHP", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png", 2)

        );
    
    @GetMapping(value = "/linguagens")
    public List<Linguagem> obterLinguagens(){
        return linguagens;
    }
}
