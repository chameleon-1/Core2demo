package service;

import dto.User;
import fileproccess.CreateFile;
import fileproccess.ReadFile;
import parser.ParseToList;
import parser.ParseToMap;
import parser.ParseToQueue;
import parser.ParseToSet;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import static files.Files.*;

public class FileToDtoService {
    public static final String LIST_TXT = "list.txt";
    public static final String QUEUE_TXT = "queue.txt";
    public static final String SET_TXT = "set.txt";
    public static final String MAP_TXT = "map.txt";

    CreateFile createFile = new CreateFile();
    ReadFile readFile = new ReadFile();

    ParseToList parseToList = new ParseToList();
    ParseToMap parseToMap = new ParseToMap();
    ParseToSet parseToSet = new ParseToSet();
    ParseToQueue parseToQueue = new ParseToQueue();

    public void parsingProcess() {
        createFile();       //вызываем метод создания файла

        String listContent = readFile.readFile(LIST_TXT);
        System.out.println("Процесс логирования : listContent = "+ listContent);
        String queueContent = readFile.readFile(QUEUE_TXT);
        System.out.println("Процесс логирования : queueContent = "+ queueContent);
        String setContent = readFile.readFile(SET_TXT);
        System.out.println("Процесс логирования : setContent = "+ setContent);
        String mapContent = readFile.readFile(MAP_TXT);
        System.out.println("Процесс логирования : mapContent = "+ mapContent);

        List<String> list = parseToList.parseToList(listContent);
        Set<String> set = parseToSet.parseToSet(setContent);
        Map<Integer, String> map = parseToMap.parseStringToMap(mapContent);
        Queue<String> queue = parseToQueue.parseToQueue(queueContent);

        User user = parseToDto(map, list, queue, set);
        System.out.println("Процесс логирования : user = "+ user);
    }

    private User parseToDto(Map<Integer, String> map, List<String> list, Queue<String> queue, Set<String> set) {
        User karl = new User();
        for (String name : list){
            if(name.equals("Karl")){
                karl.setName(name);
            }
        }
        for (String message : queue){
            if(message.equals("message2")){
                karl.setMessage(message);
            }
        }
        for (String personalNumber : set){
            if(personalNumber.equals("124")){
                karl.setPersonalNumber(personalNumber);
            }
        }
        for(Map.Entry <Integer, String> entry: map.entrySet()) {        //что здесь написанно? (тайм код 41 минута)
            if (entry.getValue().equals("karlPassword")){               // почему возвращает пароль null?
                karl.setPassword(entry.getKey());
            }
        }
        return karl;
    }

    private void createFile() {
        createFile.createFile(LIST_TXT, LIST_CONTENT);            //создаем файл, вызываем метод креатеФайл, тк он принадлежит обькту типа КреатеФайл
        createFile.createFile(QUEUE_TXT, QUEUE_CONTENT);
        createFile.createFile(SET_TXT, SET_CONTENT);
        createFile.createFile(MAP_TXT, MAP_CONTENT);
    }
}
