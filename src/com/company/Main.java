package com.company;

public class Main {

    public static void main(String[] args) {
	char c1 = '\u261b';
	char c2 = '\u27f4';
      //получение из строк символов
	String s = ""+c1+c2;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(s);

        //сравнение
        String s1 = "first";
        String s2 = "firss";
        int i = s1.compareTo(s2);
        System.out.println(i);

        //конкатенация(соеденение строк)
        s1 = s1.concat(s2);
        System.out.println(s1);

        //проверка на наличие цифр или букв
        s1 = "123w";
        System.out.println(isContainsOnlyDigits(s1));

        //сщдуржит ли строка заданую подстроку

        s1 = "good";
        s2 = "oob";
        System.out.println(s1.contains((s2)));

        //заменить символ в строке
        s1 = "why.";
        int pos = s1.indexOf('.');
        s1 = s1.replace('.', '?');
        System.out.println(s1);

        //извлечь подстроку JVM
        s1 = "JDK vs JRE vs JVM";
        String jvm = s1.substring(14);
        System.out.println(jvm);
        String jre = s1.substring(7,10);
        System.out.println(jre);

    }

    private static boolean isContainsOnlyDigits(String s){
        boolean result = true;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (!Character.isDigit(c)) result = false;
        }
        return result;
    }



}
