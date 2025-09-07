package design_patterns.behavioral.chain_of_responsibility_pattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandle(HttpRequest request) {
        log.info("Authenticating user: {}", request.getUsername());
        return !("admin".equals(request.getUsername()) && "123".equals(request.getPassword()));
        // If authentication fails, stop the chain here
    }
}
