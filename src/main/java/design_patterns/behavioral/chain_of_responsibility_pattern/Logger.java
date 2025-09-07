package design_patterns.behavioral.chain_of_responsibility_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Logger {
    public void log(HttpRequest request) {
        log.info("Logging request for user: {}", request.getUsername());
    }
}
