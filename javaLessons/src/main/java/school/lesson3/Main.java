package school.lesson3;

public class Main {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];

        empArr[0] = new Employee("Smirnov Viktor", "Director",
                "smvik@mailbox.com", "892312311", 55000, 50);
        empArr[1] = new Employee("Kot Fedor", "Accountant",
                "kotf@mailbox.com", "892312312", 38000, 32);
        empArr[2] = new Employee("Ivanov Ivan", "Engineer",
                "ivivan@mailbox.com", "892312313", 30000, 33);
        empArr[3] = new Employee("Petrova Elena", "Economist",
                "petrpetr@mailbox.com", "892312314", 25000, 45);
        empArr[4] = new Employee("Chernenko Galina", "Secretary",
                "cgal@mailbox.com", "892312315", 20000, 25);

        for (int i = 0; i < empArr.length; i++) {
            if (empArr[i].getAge() > 40) {
                empArr[i].getEmployeeInfo();
            }
        }

    }
}
