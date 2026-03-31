package com.springfundamentals.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static org.assertj.core.api.Assertions.*;

/**
 * Tests for request-scoped bean behaviour.
 * <p>
 * Because there is no real HTTP request in a unit test, each test must manually
 * bind a {@link MockHttpServletRequest} to the {@link RequestContextHolder}
 * before accessing the request-scoped bean.
 */
@SpringBootTest
@ActiveProfiles("test")
@DisplayName("RequestScopedService — bean scope")
class RequestScopedServiceTest {

    @Autowired
    private RequestScopedService requestScopedService;

    // -------------------------------------------------------------------------
    // Helper
    // -------------------------------------------------------------------------

    private void bindMockRequest() {
        MockHttpServletRequest mockRequest = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(mockRequest));
    }

    private void clearRequestContext() {
        RequestContextHolder.resetRequestAttributes();
    }

    // -------------------------------------------------------------------------
    // Request-scope contract
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("instance identity per request")
    class InstanceIdentity {

        @Test
        @DisplayName("same instance is returned within a single simulated request")
        void sameInstanceWithinRequest() {
            // TODO: bindMockRequest(), call getInstanceHashCode twice, assert equal,
            //       then clearRequestContext()
        }

        @Test
        @DisplayName("different instances across separate simulated requests")
        void differentInstancesAcrossRequests() {
            // TODO: simulate two separate requests, capture hash codes,
            //       assert they differ
        }
    }

    // -------------------------------------------------------------------------
    // getRequestId
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("getRequestId")
    class GetRequestId {

        @Test
        @DisplayName("returns a non-null, non-blank request identifier")
        void shouldReturnRequestId() {
            // TODO: bindMockRequest(), call getRequestId(), assert not blank,
            //       then clearRequestContext()
        }

        @Test
        @DisplayName("request ID is consistent within the same request context")
        void requestIdShouldBeConsistentWithinRequest() {
            // TODO: bindMockRequest(), call getRequestId() twice, assert equal,
            //       then clearRequestContext()
        }
    }
}
