package com.andretech.tranferbankapi.controllers.v1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/transfer")
@RestController
public class TransferBankController {

    @GetMapping("/all")
    public ResponseEntity<String>returnarAlgo(){
        return ResponseEntity.ok("Endpoint funcionando com sucesso.");
    }
}
