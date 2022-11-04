package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.requests.LanguageRequest;
import kodlama.io.devs.business.responses.LanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/languages")
public class LanguageController {
    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<LanguageResponse> getAll(){
        return languageService.getall();
    }

    @PostMapping("/add")
    public LanguageResponse add(@RequestBody LanguageRequest languageRequest){
        return languageService.add(languageRequest);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody LanguageRequest languageRequest){
        languageService.delete(languageRequest);
    }

    @PostMapping("/update")
    public LanguageResponse update(@RequestBody LanguageRequest languageRequest){
        return languageService.update(languageRequest);
    }

    @GetMapping("/getbyid/{id}")
    public LanguageResponse getById(@PathVariable("id") int id){
        return languageService.getById(id);
    }

}
