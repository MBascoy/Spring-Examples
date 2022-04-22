package com.example.ApiRestExample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class RequestController {

    @GetMapping("/getRequest")
    public String getRequest(@RequestParam String message){
        return "GET Request Succesfull, message: " + message;
    }

    @GetMapping("/getRequest/{nombre}/persona")
    public String getRequestPath(@PathVariable String nombre){
        return "GET Request Succesfull, Persona: " + nombre;
    }

    @PostMapping("/postRequest")
    public String postRequest(@RequestBody Messages messages){
        return "POST Request Succesfull " + messages.getMessage1() + messages.getMessage2();
    }

    @PutMapping("/putRequest")
    public String putRequest(){
        return "PUT Request Succesfull";
    }
    
}
