package design_patterns.behavioral.chain_of_responsibility_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Compressor extends Handler {

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        log.info("Compressing response for user: {}", request.getUsername());
        return false;   // Always pass to the next handler
    }
}
