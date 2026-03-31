package com.springfundamentals.service;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

/**
 * Request-scoped service.
 * <p>
 * A new instance is created for each incoming HTTP request and destroyed when
 * the request completes. The {@code ScopedProxyMode.TARGET_CLASS} proxy allows
 * this bean to be injected into singleton beans safely.
 * <p>
 * Experiment:
 * <ol>
 *   <li>Call GET /scopes/request twice in quick succession (different HTTP requests).</li>
 *   <li>Observe that the identity hash code differs between requests.</li>
 *   <li>Within a single request, the same instance is used throughout.</li>
 * </ol>
 */
@Slf4j
@Service
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestScopedService {

    @PostConstruct
    public void init() {
        log.info("RequestScopedService @PostConstruct — instance hash: {}", System.identityHashCode(this));
    }

    /** Returns the identity hash code of this request-scoped instance. */
    public int getInstanceHashCode() {
        // TODO: return System.identityHashCode(this)
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    /** Returns a request-unique identifier (e.g., from RequestContextHolder). */
    public String getRequestId() {
        // TODO: derive or generate a per-request identifier
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }
}
