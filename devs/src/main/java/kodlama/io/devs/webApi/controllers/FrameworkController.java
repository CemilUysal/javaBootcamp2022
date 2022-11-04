package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.FrameworkService;
import kodlama.io.devs.business.requests.FrameworkRequest;
import kodlama.io.devs.business.responses.FrameworkResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/frameworks")
public class FrameworkController {
    private FrameworkService frameworkService;

    @Autowired
    public FrameworkController(FrameworkService frameworkService) {
        this.frameworkService = frameworkService;
    }

    @GetMapping("/getall")
    public List<FrameworkResponse> getAll(){
        return frameworkService.getall();
    }

    @PostMapping("/add")
    public FrameworkResponse add(@RequestBody FrameworkRequest frameworkRequest){
        return frameworkService.add(frameworkRequest);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody FrameworkRequest frameworkRequest){
        frameworkService.delete(frameworkRequest);
    }

    @PostMapping("/update")
    public FrameworkResponse update(@RequestBody FrameworkRequest frameworkRequest){
        return frameworkService.update(frameworkRequest);
    }

    @GetMapping("/getbyid/{id}")
    public FrameworkResponse getById(@PathVariable("id") int id){
        return frameworkService.getById(id);
    }

}
