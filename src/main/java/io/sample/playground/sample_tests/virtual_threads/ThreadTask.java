package io.sample.playground.sample_tests.virtual_threads;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadTask {

    public void handleRequest() {
        try {
            Thread.sleep(2000);
            log.info("Handling request for thread {} ended", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            log.error("Thread {} interrupted", Thread.currentThread().getName(), e);
            Thread.currentThread().interrupt();
        }
    }
}
