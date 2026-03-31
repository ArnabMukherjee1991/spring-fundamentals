package com.springfundamentals.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Prototype-scoped service.
 * <p>
 * A <em>new</em> instance is created every time this bean is requested from
 * the application context (via {@code ObjectProvider<PrototypeService>} or a
 * {@code @Lookup} method). If injected directly into a singleton the same
 * prototype instance would be reused — always retrieve via the ObjectProvider.
 * <p>
 * Experiment:
 * <ol>
 *   <li>Call GET /scopes/prototype multiple times.</li>
 *   <li>Observe that the identity hash code changes with every request.</li>
 *   <li>Note that {@code @PreDestroy} is NOT called automatically by Spring;
 *       lifecycle management is the caller's responsibility.</li>
 * </ol>
 */
@Slf4j
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeService {

    @PostConstruct
    public void init() {
        log.info("PrototypeService @PostConstruct — instance hash: {}", System.identityHashCode(this));
    }

    @PreDestroy
    public void destroy() {
        log.info("PrototypeService @PreDestroy — NOT automatically called by Spring for prototype beans");
    }

    /** Returns the identity hash code of this prototype instance. */
    public int getInstanceHashCode() {
        // TODO: return System.identityHashCode(this)
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }

    /** Placeholder for prototype-scoped business logic. */
    public String doWork() {
        // TODO: implement
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }
}
