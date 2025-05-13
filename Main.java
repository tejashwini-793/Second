package Second;

class Date {
    int day, month, year;

    Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }
}

class Student {
    String name;
    Date dob;

    Student(String n, Date d) {
        name = n;
        dob = d;
    }

    void displayInfo(Date currentDate) {
        int age = currentDate.year - dob.year;

        if (currentDate.month < dob.month || 
           (currentDate.month == dob.month && currentDate.day < dob.day)) {
            age--; 
        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Date birthDate = new Date(10, 5, 2007);
        Date today = new Date(29, 4, 2025);    

        Student s = new Student("Alice", birthDate);
        s.displayInfo(today);
    }
}