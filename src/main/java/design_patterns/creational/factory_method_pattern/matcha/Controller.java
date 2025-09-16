package design_patterns.creational.factory_method_pattern.matcha;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        MatchaViewEngine viewEngine = new MatchaViewEngine();
        String html = viewEngine.render(viewName, context);
        log.info(html);
    }
}
