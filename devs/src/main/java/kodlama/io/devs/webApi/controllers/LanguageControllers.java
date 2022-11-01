package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/languages")
public class LanguageControllers {
    private LanguageService languageService;

    @Autowired
    public LanguageControllers(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll(){
        return languageService.getall();
    }

    @PostMapping("/add")
    public List<Language> add(@RequestBody Language language){
        return languageService.add(language);
    }

    @GetMapping("/delete/{id}")
    public List<Language> delete(@PathVariable("id") int id){
        return languageService.delete(id);
    }

    @PostMapping("/update")
    public List<Language> update(@RequestBody Language language){
        return languageService.update(language);
    }

    @GetMapping("/getbyid/{id}")
    public Language getById(@PathVariable("id") int id){
        return languageService.getById(id);
    }

}
