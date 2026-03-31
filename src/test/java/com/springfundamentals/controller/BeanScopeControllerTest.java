package com.springfundamentals.controller;

import com.springfundamentals.service.PrototypeService;
import com.springfundamentals.service.RequestScopedService;
import com.springfundamentals.service.SingletonService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Web-layer slice tests for {@link BeanScopeController}.
 */
@WebMvcTest(BeanScopeController.class)
@ActiveProfiles("test")
@DisplayName("BeanScopeController")
class BeanScopeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private SingletonService singletonService;

    @MockitoBean
    private ObjectProvider<PrototypeService> prototypeServiceProvider;

    @MockitoBean
    private RequestScopedService requestScopedService;

    // -------------------------------------------------------------------------
    // GET /api/v1/scopes/singleton
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("GET /api/v1/scopes/singleton")
    class GetSingletonInfo {

        @Test
        @DisplayName("returns 200 with singleton hash code")
        void shouldReturn200WithHash() throws Exception {
            // TODO: given singletonService.getInstanceHashCode() returns 12345
            //       when GET /api/v1/scopes/singleton
            //       then status 200, body contains 'hashCode' == 12345
        }
    }

    // -------------------------------------------------------------------------
    // GET /api/v1/scopes/prototype
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("GET /api/v1/scopes/prototype")
    class GetPrototypeInfo {

        @Test
        @DisplayName("returns 200 with prototype hash code")
        void shouldReturn200WithHash() throws Exception {
            // TODO: given prototypeServiceProvider.get().getInstanceHashCode() returns 99999
            //       when GET /api/v1/scopes/prototype
            //       then status 200, body contains 'hashCode' == 99999
        }

        @Test
        @DisplayName("consecutive calls return different hash codes (proves new instance per call)")
        void consecutiveCallsShouldReturnDifferentHashes() throws Exception {
            // TODO: stub two consecutive calls to return different hash codes,
            //       make two requests, assert response bodies differ
        }
    }

    // -------------------------------------------------------------------------
    // GET /api/v1/scopes/request
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("GET /api/v1/scopes/request")
    class GetRequestScopedInfo {

        @Test
        @DisplayName("returns 200 with request-scoped hash code and requestId")
        void shouldReturn200WithHashAndRequestId() throws Exception {
            // TODO: given requestScopedService returns hash and requestId
            //       when GET /api/v1/scopes/request
            //       then status 200, body contains 'hashCode' and 'requestId'
        }
    }

    // -------------------------------------------------------------------------
    // GET /api/v1/scopes/all
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("GET /api/v1/scopes/all")
    class GetAllScopesInfo {

        @Test
        @DisplayName("returns 200 with info for all three scopes")
        void shouldReturn200WithAllScopeInfo() throws Exception {
            // TODO: stub all three services, when GET /api/v1/scopes/all
            //       then status 200, body contains 'singleton', 'prototype', 'request' keys
        }
    }
}
