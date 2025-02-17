package org.annotations.customannotation.intermediateleve.loggingmethodexecution;
public class TaskService {

    @LogExecutionTime
    public void taskOne() {
        try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
    }

    @LogExecutionTime
    public void taskTwo() {
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
    }

    @LogExecutionTime // Add this annotation to measure time for taskThree
    public void taskThree() {
        try { Thread.sleep(1500); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

