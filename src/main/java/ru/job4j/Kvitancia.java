package ru.job4j;

public class Kvitancia {
    private Integer number;
    private String name;
    public Float summa;

    private String nameCorrector;

    public static Integer counts = 0;

    Kvitancia(Integer number, String name, Float summa) {
        System.out.println("2Object is done"); // конструктор, срабатывает (в данном случае) при инициализацмя
        this.number = number;
        this.name = name;
        this.summa = summa;
        counts++;
    } // перегрузка конструктора, чтобы мы смогли дать выбор заполнения количества полей

    Kvitancia(Integer number, String name) {
        this(number, name, 0.0f);
    }

    Float getSumma(){
        return summa;
    }

    String getNameCorrector(){
        return nameCorrector;
    }

    void corrections(){
        System.out.println("name: " + nameCorrector + " summa: " + summa);
    }

    void setSumma(String nameCorrector, Float summa){
        this.nameCorrector = nameCorrector;
        this.summa = summa;
    }

    public static void myCounts(){
        System.out.println(counts);
    }
}

class MyOplata {
    public static void main(String[] args) {
        Kvitancia svet;
        svet = new Kvitancia(14, "svet"); // инициализация объекта

        //Kvitancia svet = new Kvitancia(); другая запись инициализации объекта


//        System.out.println("eto number " + svet.number);
//
//        svet.number = 20;
//
//        System.out.println("eto poddelniy number " + svet.number);

        Kvitancia voda;
        voda = new Kvitancia(18, "voda"); // инициализация объекта

        Kvitancia gaz = new Kvitancia(1231, "GAZ", 100.500f);

        System.out.println(gaz.getSumma());

        gaz.setSumma("Ali", 50.1f);

        System.out.println(gaz.getSumma() + " " + gaz.getNameCorrector());
        gaz.corrections();

        System.out.println(Kvitancia.counts);

        System.out.println(new Kvitancia(14, "asd", 12.54f).summa);

        Kvitancia.myCounts();
    }

}
