package com.example.hello_grpc.controller;

import com.example.grpc.client.GrpcClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcController {
    private final GrpcClientService grpcClientService;

    public GrpcController(GrpcClientService grpcClientService) {
        this.grpcClientService = grpcClientService;
    }

    @GetMapping("/grpc/hello")
    public String sayHello(@RequestParam String name) {
        return grpcClientService.sendHello(name);
    }
}
