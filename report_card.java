public class report_card {
    public static void main(String[] args) {
        // input variables
        System.out.println("Enter the student's name: ");
        String studentName = System.console().readLine();
        System.out.println("Enter the student's ID: ");
        String studentID = System.console().readLine();

        // grades
        System.out.println("Enter the grade for Mathematics: ");
        String mathGrade = System.console().readLine();
        System.out.println("Enter the grade for Science: ");
        String scienceGrade = System.console().readLine();
        System.out.println("Enter the grade for English: ");
        String englishGrade = System.console().readLine();

        // display report card
        System.out.println("Report Card for " + studentName);
        System.out.println("=================================");
        System.out.println("Student ID: " + studentID);

        // display grades

        System.out.println("Grades:");
        System.out.println("Mathematics: " + mathGrade);
        System.out.println("Science: " + scienceGrade);
        System.out.println("English: " + englishGrade);
    }
}