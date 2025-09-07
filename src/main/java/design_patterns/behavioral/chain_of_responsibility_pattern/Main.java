package design_patterns.behavioral.chain_of_responsibility_pattern;

public class Main {
    public static void main(String[] args) {
        // Processing pipeline: Authentication -> Logging -> Compression
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);
        WebServer webServer = new WebServer(authenticator);
        webServer.handle(new HttpRequest("admin", "123"));
    }
}
