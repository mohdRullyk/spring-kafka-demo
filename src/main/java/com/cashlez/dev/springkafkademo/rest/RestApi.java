package com.cashlez.dev.springkafkademo.rest;

import com.cashlez.dev.springkafkademo.producer.PublishMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApi {

    @Autowired
    PublishMessages publishMessages;

//    @Autowired
//    ReceiveMessages receiveMessages;

    @GetMapping("/test")
    public ResponseEntity<?> getData()
    {
        publishMessages.sendMessage("Test kirim message ");
        return ResponseEntity.ok().body("Sip");
    }

}
