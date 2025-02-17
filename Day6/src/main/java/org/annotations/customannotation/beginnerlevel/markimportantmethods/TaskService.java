package org.annotations.customannotation.beginnerlevel.markimportantmethods;
public class TaskService {

    @ImportantMethod(level = "HIGH")
    public void importantTaskOne() {}

    @ImportantMethod(level = "MEDIUM")
    public void importantTaskTwo() {}

    public void normalTask() {}
}

