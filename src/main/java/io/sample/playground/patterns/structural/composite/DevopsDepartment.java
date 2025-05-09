package io.sample.playground.patterns.structural.composite;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DevopsDepartment implements Department {

    @Override
    public void printDepartmentName() {
        log.info(getClass().getSimpleName());
    }
}
