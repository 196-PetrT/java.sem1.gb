package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1); // ��������� ������� � ������
        list.addAll(Arrays.asList(2, 3, 4)); // ��������� ��������� ���������
        System.out.println(list);
    }

}