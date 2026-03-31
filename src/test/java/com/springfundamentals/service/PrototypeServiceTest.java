package com.springfundamentals.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.*;

/**
 * Tests for prototype bean scope behaviour.
 * <p>
 * The {@link ObjectProvider} is used so that each call to {@code get()} creates a
 * brand-new {@link PrototypeService} instance — this is the correct pattern
 * for consuming prototype beans from a singleton.
 */
@SpringBootTest
@ActiveProfiles("test")
@DisplayName("PrototypeService — bean scope")
class PrototypeServiceTest {

    @Autowired
    private ObjectProvider<PrototypeService> prototypeServiceProvider;

    // -------------------------------------------------------------------------
    // Prototype contract
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("instance identity")
    class InstanceIdentity {

        @Test
        @DisplayName("two Provider.get() calls return distinct instances")
        void consecutiveGetCallsShouldReturnDifferentInstances() {
            // TODO: obtain two instances, assertThat(a).isNotSameAs(b)
        }

        @Test
        @DisplayName("identity hash codes differ between consecutive obtainments")
        void hashCodesShouldDifferBetweenInstances() {
            // TODO: call getInstanceHashCode on both, assertThat not equal
        }
    }

    // -------------------------------------------------------------------------
    // doWork
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("doWork")
    class DoWork {

        @Test
        @DisplayName("returns a non-null, non-blank result on fresh instance")
        void shouldReturnNonNullResult() {
            // TODO: provider.get().doWork(), assert not blank
        }
    }

    // -------------------------------------------------------------------------
    // Lifecycle
    // -------------------------------------------------------------------------

    @Nested
    @DisplayName("lifecycle")
    class Lifecycle {

        @Test
        @DisplayName("@PostConstruct fires on every new prototype instance")
        void postConstructShouldFireForEachInstance() {
            // TODO: this is observable via log output; assert no exception thrown
            //       and that multiple instances are successfully created
        }

        @Test
        @DisplayName("@PreDestroy is NOT called automatically by Spring")
        void preDestroyShouldNotBeCalledAutomatically() {
            // TODO: document/demonstrate that Spring does not track prototype instances;
            //       assert the instance can be GC'd without Spring intervention
        }
    }
}
