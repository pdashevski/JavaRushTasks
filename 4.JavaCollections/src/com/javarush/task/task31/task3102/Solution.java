package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File folder = new File(root);
        List<String> fileList = new ArrayList<>();
        for (File file : folder.listFiles()) {
            fileList.add(file.getName());
            File folder1 = new File(folder.getAbsolutePath());
            for (File file1 : folder1.listFiles()) {
                fileList.add(file1.getName());
            }
            //System.out.println(file.getName());
        }
        return fileList;
    }

    public static void main(String[] args) {
        try {
            System.out.println(getFileTree("C:\\Users\\Musya\\Desktop\\JavaRushTasks\\out"));
        } catch (IOException exception) {
            System.out.println(exception.getStackTrace());
        }

    }
}
