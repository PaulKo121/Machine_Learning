package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("api")
public class Controller {

    @PostMapping("predict")
    public ResponseEntity<String> ReceiveData(@RequestBody List<Map<String, Object>> predict) {
        
        System.out.println("接收到的數據：" + predict);
        return ResponseEntity.status(HttpStatus.OK).body("接收成功");
    }
    
    
}