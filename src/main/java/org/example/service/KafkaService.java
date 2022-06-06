package org.example.service;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class KafkaService {

    @Autowired
    private StreamBridge streamBridge;

    public void sendMessage(String message){
        streamBridge.send("producer-out-0", message);
    }
    
}