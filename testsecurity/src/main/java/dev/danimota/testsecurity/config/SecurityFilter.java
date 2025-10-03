package dev.danimota.testsecurity.config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.util.Strings;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.Optional;

@Component
public class SecurityFilter extends OncePerRequestFilter {

    private final TokenConfig tokenConfig;

    public SecurityFilter(TokenConfig tokenConfig) {
        this.tokenConfig = tokenConfig;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authorizedHeader = request.getHeader("Authorization");
        if(Strings.isNotEmpty(authorizedHeader) && authorizedHeader.startsWith("Bearer ")){
            String token = authorizedHeader.substring("Bearer ".length());
            Optional<JWTUserData> optionalUser = tokenConfig.validateToken(token);

            if (optionalUser.isPresent()) {

                JWTUserData userData = optionalUser.get();
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userData.userId(), null, null);
                SecurityContextHolder.getContext().setAuthentication(authentication);

            }
            filterChain.doFilter(request, response);
        } else {
            filterChain.doFilter(request, response);
        }
    }
}
