class Student {
    int rollNumber;
    String studentName;

    public void studentInformation(){
        System.out.println("Student Name:"+" "+ studentName);

        System.out.println("Student rollNumber:"+" "+ rollNumber);
    }

    static public void  main(String[] args) {
        Student student = new Student(); // Default constructor is initialized here, when we have created object.

        student.studentInformation();       
        System.out.println();

        student.rollNumber = 30;
        student.studentName = "Prince Kumar";

        student.studentInformation();
      
    }
}
