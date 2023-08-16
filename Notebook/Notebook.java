package Notebook;
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

// Работу сдать как обычно ссылкой на гит репозиторий

// P.S. Частые ошибки смотри в конце семинара


public class Notebook {
    private double diagonal;
    private String color;
    private int memoryRAM;
    private int memoryHDD;
    private String operatingSystem;
    private String brand;
    private String name;
    private String personalCode;

    public Notebook(double diagonal, String color, int memoryRAM, int memoryHDD, String operatingSystem, String brand, String name, String personalCode){
        this.diagonal = diagonal;
        this.color = color;
        this.memoryRAM = memoryRAM;
        this.memoryHDD = memoryHDD;
        this.operatingSystem = operatingSystem;
        this.brand = brand;
        this.name = name;
        this.personalCode = personalCode;

    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public int getMemoryHDD() {
        return memoryHDD;
    }

    public int getMemoryRAM() {
        return memoryRAM;
    }

    public String getName() {
        return name;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public String toString(){
        return "brand: " + brand + "\nname: " + name + "\ndiagonal: " + diagonal + "\ncolor: " + color + "\nmemoryRAM: " + memoryRAM + "\nmemoryHDD: " + memoryHDD + "\noperatingSystem: " + operatingSystem + "\npersonalCode: " + personalCode + "\n" + "\n";
    }
}
