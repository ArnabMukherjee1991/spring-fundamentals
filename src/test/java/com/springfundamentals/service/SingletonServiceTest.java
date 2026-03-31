package com.springfundamentals.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.*;

/**
 * Tests for singleton bean scope behaviour.
 * <p>
 * Uses a full application context (via {@code @SpringBootTest}) so that
 * Spring's actual scope management is exercised.
 */
@SpringBootTest
@ActiveProfiles("test")
@DisplayName("SingletonService — bean scope")
class SingletonServiceTest {

    @Autowired
    private SingletonService singletonServiceA;

    @Autowired
    private SingletonService singletonServiceB;

    // -------------------------------------------------------------------------
    // Singleton contract
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("instance identity")
    class InstanceIdentity {

        @Test
        @DisplayName("both injections refer to the exact same instance")
        void bothInjectionsShouldBeTheSameInstance() {
            // TODO: assertThat(singletonServiceA).isSameAs(singletonServiceB)
        }

        @Test
        @DisplayName("identity hash codes are equal across injections")
        void hashCodeShouldBeConsistent() {
            // TODO: call getInstanceHashCode on both, assert equal
        }
    }

    // -------------------------------------------------------------------------
    // doWork
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("doWork")
    class DoWork {

        @Test
        @DisplayName("returns a non-null, non-blank result")
        void shouldReturnNonNullResult() {
            // TODO: call doWork(), assertThat result isNotBlank
        }
    }
}
