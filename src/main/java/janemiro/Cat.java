package janemiro;

public class Cat {
    String name;
    String sex;
    int age;
    String color;
    String note;
    boolean needsMedHelp;

    public void shelterPromo() {
        System.out.println("Знакомьтесь! Это " + sex + " " + name + ", возраст: " + age + ", цвет: " + color + ". Хотите взять домой? Правда, есть нюанс: " + note);
    }

    public static void main(String[] args) {
        Cat murzik = new Cat();
        murzik.name = "Мурзик";
        murzik.age = 5;
        murzik.sex = "котик";
        murzik.color = "чёрный";
        murzik.note = "нет одной лапки";
        murzik.needsMedHelp = false;

        Cat myshka = new Cat();
        myshka.name = "Мышка";
        myshka.age = 2;
        myshka.sex = "кошечка";
        myshka.color = "рыжий";
        myshka.note = "покусали собаки";
        myshka.needsMedHelp = true;

        murzik.shelterPromo();
        myshka.shelterPromo();

    }
}
