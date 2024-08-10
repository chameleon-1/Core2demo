package fileproccess;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public String readFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();          //������������ (����������) - ���������� ������, �� ������� ����� ������ � �������� ���������
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {        //try  � ���������, ��� ����������� ����� ������������� ������
            String line;
            while ((line = reader.readLine()) != null) {            //����������� ����� �������� ������ � ���������: ���� �� ������� � �����, ������� ����� ������� (�� ������� null)
                stringBuilder.append(line);                 //������� � ������������ ��� ������ ���������� � �����
            }


        } catch (FileNotFoundException e) {
            System.out.println("������� ����������� " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("������� ����������� " + e.getMessage());
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }
}
