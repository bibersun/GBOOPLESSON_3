package MyHW;


import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Employee generateEmpl() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        int hourlyRate = random.nextInt(360, 721);
        int age = random.nextInt(18, 71);
        var epl = random.nextInt(0, 2);
        String sname = surnames[random.nextInt(surnames.length)];
        String nm = names[random.nextInt(names.length)];
        switch (epl){
            case 0:
                return new Worker(sname, nm, age, hourlyRate);
            case 1:
                return new Freelancer(sname, nm, age, hourlyRate);
            default:
//                по идее здесь в exeption надо вываливаться, но не знаю синтаксиса java
                return new Freelancer(sname, nm, age, hourlyRate);
        }
    }

    public static Employee[] genEmpl(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++) {
            employees[i] = generateEmpl();
        }
        return employees;
        }
    }
