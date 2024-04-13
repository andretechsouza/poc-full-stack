package com.andretech.calculatorapi.controllers.v1;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/calculate")
@RestController
@Tag(name = "User Controller", description = "Handle user operations")
public class CalculatorController {

    @GetMapping
    @Operation(summary = "List all users", description = "Returns a list of users")
    @ApiResponse(responseCode = "200", description = "Successful Operation", content = @Content(schema = @Schema(implementation = String.class)))
    public ResponseEntity<String> returnarAlgo(){
        log.info("CALCULATOR_API - executado com sucesso.....");
        return ResponseEntity.ok("Endpoint em CALCULATOR_API_V1 funcionando com sucesso..");
    }
}
