package design_patterns.creational.factory_method_pattern.real_world_example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WordDocument implements Document {
    @Override
    public void open() {
        log.info("WordDocument open");
    }

    @Override
    public void save() {
        log.info("WordDocument save");
    }

    @Override
    public void print() {
        log.info("WordDocument print");
    }

    @Override
    public void close() {
        log.info("WordDocument close");
    }
}
