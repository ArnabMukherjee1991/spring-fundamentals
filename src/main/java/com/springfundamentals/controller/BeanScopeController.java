package com.springfundamentals.controller;

import com.springfundamentals.service.PrototypeService;
import com.springfundamentals.service.RequestScopedService;
import com.springfundamentals.service.SingletonService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Demonstrates Spring bean scopes.
 * <p>
 * <ul>
 *   <li>Singleton — same hash code on every request.</li>
 *   <li>Prototype — different hash code on every request (fetched via {@link ObjectProvider}).</li>
 *   <li>Request-scoped — different hash code per HTTP request, same within a request.</li>
 * </ul>
 */
@RestController
@RequestMapping("/api/v1/scopes")
@RequiredArgsConstructor
@Tag(name = "Bean Scopes", description = "Endpoints to observe Spring bean scope behaviour")
public class BeanScopeController {

    private final SingletonService singletonService;

    /** ObjectProvider ensures a fresh prototype instance is created on each call. */
    private final ObjectProvider<PrototypeService> prototypeServiceProvider;

    /** Injected as a scoped proxy — the actual instance changes per HTTP request. */
    private final RequestScopedService requestScopedService;

    @Operation(summary = "Return the identity hash code of the singleton bean")
    @ApiResponse(responseCode = "200", description = "Singleton hash returned")
    @GetMapping("/singleton")
    public ResponseEntity<Map<String, Object>> getSingletonInfo() {
        // TODO: return singletonService.getInstanceHashCode() and scope name
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Return the identity hash code of a freshly obtained prototype bean")
    @ApiResponse(responseCode = "200", description = "Prototype hash returned")
    @GetMapping("/prototype")
    public ResponseEntity<Map<String, Object>> getPrototypeInfo() {
        // TODO: obtain instance via prototypeServiceProvider.get(), return its hash
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Return the identity hash code of the request-scoped bean")
    @ApiResponse(responseCode = "200", description = "Request-scoped hash returned")
    @GetMapping("/request")
    public ResponseEntity<Map<String, Object>> getRequestScopedInfo() {
        // TODO: return requestScopedService.getInstanceHashCode() and requestId
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    @Operation(summary = "Return hash codes for all three scopes in one call")
    @ApiResponse(responseCode = "200", description = "All scope hashes returned")
    @GetMapping("/all")
    public ResponseEntity<Map<String, Object>> getAllScopesInfo() {
        // TODO: aggregate singleton, prototype and request-scoped info into one response map
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }
}
