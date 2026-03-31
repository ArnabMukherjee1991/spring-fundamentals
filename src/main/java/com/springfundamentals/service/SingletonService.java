package com.springfundamentals.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Singleton-scoped service (Spring's default scope).
 * <p>
 * A single instance is created when the application context starts and
 * the same instance is reused for every injection point.
 * <p>
 * Experiment:
 * <ol>
 *   <li>Call GET /scopes/singleton multiple times.</li>
 *   <li>Observe that the identity hash code never changes.</li>
 *   <li>See {@code @PostConstruct} fire once at startup and {@code @PreDestroy}
 *       fire once when the context closes.</li>
 * </ol>
 */
@Slf4j
@Service
public class SingletonService {

    @PostConstruct
    public void init() {
        log.info("SingletonService @PostConstruct — instance hash: {}", System.identityHashCode(this));
    }

    @PreDestroy
    public void destroy() {
        log.info("SingletonService @PreDestroy — instance hash: {}", System.identityHashCode(this));
    }

    /** Returns the identity hash code of this singleton instance. */
    public int getInstanceHashCode() {
        // TODO: return System.identityHashCode(this)
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    /** Placeholder for singleton-scoped business logic. */
    public String doWork() {
        // TODO: implement
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }
}
