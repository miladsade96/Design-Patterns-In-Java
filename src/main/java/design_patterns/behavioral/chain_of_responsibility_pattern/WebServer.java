package design_patterns.behavioral.chain_of_responsibility_pattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WebServer {

    private Handler handler;

    public void handle(HttpRequest request) {
        // Authentication
        // Logging
        // Compression
        handler.handle(request);
    }
}
