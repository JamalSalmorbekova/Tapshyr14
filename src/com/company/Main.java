package com.company;

public class Main {

    public static void main(String[] args) {
//   Class деген Ссылка  менен Обьект  тузуш  керек
	Class cancoz = new Class(69,"Жамал эже", new int[]{1, 9, 5});
        System.out.println(" nomer деген  поледеги сан - "+ cancoz.getNomer()+"; соз деген поледеги  соз - "+cancoz.getCoz()+";");
       System.out.println(" Массивдин элементтери ^");
        // forarech  массивдин  элементтерин  консолго  чыгаруучу цикл
        for (int p:new int[]{1,9,5}) {
            System.out.print(" "+p+" ,");


        }
        }}

