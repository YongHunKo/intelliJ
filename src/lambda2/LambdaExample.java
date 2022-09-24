package lambda2;

import java.util.function.ToIntFunction;

public class LambdaExample {
    private final static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권",95,93)
    };
    public static double avg(ToIntFunction<Student> function){
        int sum = 0;
        for(Student student : students){
            sum += function.applyAsInt(student);
        }
        double avg = (double) sum / students.length;
        return avg;
    }

    public static void main(String[] args) {
//        double englishAvg = avg( s->s.getEnglishScore());
//        System.out.println("영어 평균 점수 : "+englishAvg);
//
//        double mathAvg = avg( s->s.getMathScore());
//        System.out.println("수학 평균 점수 : "+mathAvg);
        // 참조를 안한 6번문제
        double englishAvg = avg( Student::getEnglishScore);
        System.out.println("영어 평균 점수 : "+englishAvg);

        double mathAvg = avg(Student::getMathScore);
        System.out.println("수학 평균 점수 : "+mathAvg);
        // 7번문제
    }
    public static class Student {
        private final String name;
        private final int englishScore;
        private final int mathScore;

        public Student(String name, int englishScore, int mathScore) {
            this.name = name;
            this.englishScore = englishScore;
            this.mathScore = mathScore;
        }

        public String getName() {
            return name;
        }

        public int getEnglishScore() {
            return englishScore;
        }

        public int getMathScore() {
            return mathScore;
        }
    }
}
