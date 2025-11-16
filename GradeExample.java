public classGradeExample {
  public static void main(string[]args) {
    int marks = 82;
    String grade = (marks>=90)?"A":
                   (marsks>=75)?"B":
                   (marks>=50) ?"C":"F";
    System.out.println("Grade: "+grade);
  }
}
