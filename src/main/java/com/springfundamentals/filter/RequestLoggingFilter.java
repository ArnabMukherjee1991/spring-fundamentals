package com.springfundamentals.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * Servlet filter that logs the method, URI, and duration of every HTTP request.
 * <p>
 * Registered automatically as a Spring-managed bean. The {@code @Order(1)} ensures
 * it fires before other filters (lower value = higher priority).
 */
@Slf4j
@Component
@Order(1)
public class RequestLoggingFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {
        // TODO:
        //  1. Record start time (System.currentTimeMillis())
        //  2. Proceed with the filter chain (filterChain.doFilter)
        //  3. Calculate elapsed time
        //  4. Log: method, URI, response status, elapsed ms
        throw new UnsupportedOperationException("Not implemented yet — fill in as part of TDD exercise");
    }
}
