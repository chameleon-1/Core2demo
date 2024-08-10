package parser;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ParseToQueue {
    public Queue<String> parseToQueue (String queueContent){
        Queue <String> queue = new LinkedList<>();
        String[] splits = queueContent.split(" , ");
        Collections.addAll(queue,splits);           //метод добавл€ющий все; (куда, что)
        return queue;
    }
}
