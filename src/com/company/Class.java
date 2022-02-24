package com.company;

public class Class {
    private int nomer;
    private String coz;
   private  int[] massivSan;
   //   Конструктор  тузобу - Class  класстын  аты  менен


    public Class(int nomer, String coz, int[] massivSan) {
        this.nomer = nomer;
        this.coz = coz;
        this.massivSan = massivSan;}
//    Пустой  конструктор  колнструктор  по  умолчанию биз конструктор  тузгондуктон  жоголуп кеткедиктен кайра  тузулот}
    public Class() {

    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getCoz() {
        return coz;
    }

    public void setCoz(String coz) {
        this.coz = coz;
    }

    public int[] getMassivSan() {
        return massivSan;
    }

    public void setMassivSan(int[] massivSan) {
        this.massivSan = massivSan;
    }
}
