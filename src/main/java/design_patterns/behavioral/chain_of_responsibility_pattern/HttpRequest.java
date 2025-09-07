package design_patterns.behavioral.chain_of_responsibility_pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HttpRequest {
    private String username;
    private String password;
}
