package design_patterns.creational.factory_method_pattern.real_world_example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PDFDocument implements Document {
    @Override
    public void open() {
        log.info("PDFDocument open");
    }

    @Override
    public void save() {
        log.info("PDFDocument save");
    }

    @Override
    public void print() {
        log.info("PDFDocument print");
    }

    @Override
    public void close() {
        log.info("PDFDocument close");
    }
}
