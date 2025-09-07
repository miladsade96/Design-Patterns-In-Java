package design_patterns.behavioral.chain_of_responsibility_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Authenticator {
    public boolean authenticate(HttpRequest request) {
        log.info("Authenticating user: {}", request.getUsername());
        return "admin".equals(request.getUsername()) && "password".equals(request.getPassword());
    }
}
