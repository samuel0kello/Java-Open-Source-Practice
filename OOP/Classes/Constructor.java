public class Constructor {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student("Aditya");
            Student s3 = new Student("Rohit", 28);
            Student s4 = new Student("Rohan", 30, 103);
            Student s5 = new Student("Mohan", 31, 104, "IIT Bombay");

            System.out.println(s1.name);
            System.out.println(s1.age);
            System.out.println(s1.rollNumber);
            System.out.println(s1.college);
        }
    }
    // Constructor chaining
    class Student {
        String name;
        int age;
        int rollNumber;
        String college;

        Student() {
            //call constructor
            this("Unknown");
            System.out.println("I am in first constructor");
            //to call other method via this.method name which are not constructor
            this.markAttendance();
        }

        Student(String name) {
            this(name, 0);
            System.out.println("I am in second constructor");
        }

        Student(String name, int age) {
            this(name, age, 0);
            System.out.println("I am in third constructor");
        }

        Student(String name, int age, int rollNumber) {
            this(name, age, rollNumber, "Unknown");
            System.out.println("I am in fourth constructor");
        }

        Student(String name, int age, int rollNumber, String college) {
            //initilize instance variable
            this.name = name;
            this.age = age;
            this.rollNumber = rollNumber;
            this.college = college;

            System.out.println("I am in fifth constructor");
        }
        void markAttendance() {
            System.out.println("Attendance marked for student " + name);
        }
    }
    // "this" keyword is used to call constructor,declared instance variable,to call other method via this.method name

