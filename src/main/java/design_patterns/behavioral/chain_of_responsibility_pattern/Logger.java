package design_patterns.behavioral.chain_of_responsibility_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Logger extends Handler {
    
    public Logger(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        log.info("Logging request for user: {}", request.getUsername());
        return false;
    }
}
