package fileproccess;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public String readFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();          //стрингБилдер (мутабельна) - изменяемая строка, не создает много мусора в процессе изменения
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {        //try  с ресурсами, сам закрывается когда заканчиваются данные
            String line;
            while ((line = reader.readLine()) != null) {            //присваеваем лайну значения ридера и проверяем: если ли строчки в файле, которые можем считать (не равнные null)
                stringBuilder.append(line);                 //передаю в стрингБилдер все данные полученные в лайне
            }


        } catch (FileNotFoundException e) {
            System.out.println("Процесс логирования " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Процесс логирования " + e.getMessage());
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }
}
