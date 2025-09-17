package design_patterns.creational.factory_method_pattern.real_world_example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExcelDocument implements Document {
    @Override
    public void open() {
        log.info("ExcelDocument open");
    }

    @Override
    public void save() {
        log.info("ExcelDocument save");
    }

    @Override
    public void print() {
        log.info("ExcelDocument print");
    }

    @Override
    public void close() {
        log.info("ExcelDocument close");
    }
}
