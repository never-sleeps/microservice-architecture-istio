package ru.otus.microservicearchitecture.homework04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HealthController {

    @Value("${version}")
    private String version;

    @GetMapping("/health")
    public ResponseDto healthCheck() {
        return new ResponseDto("OK", version);
    }

    @GetMapping("/")
    public String sayHello() {
        String hostName;
        try {
            InetAddress myHost = InetAddress.getLocalHost();
            hostName = myHost.getHostName();
        } catch (UnknownHostException e) {
            hostName = "UnknownHost";
        }
        return "Hello from " + hostName;
    }
}
