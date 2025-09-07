package design_patterns.behavioral.chain_of_responsibility_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Compressor {
    public void compress(HttpRequest request) {
        log.info("Compressing response for user: {}", request.getUsername());
    }
}
