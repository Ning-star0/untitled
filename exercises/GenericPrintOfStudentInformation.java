package exercises;

public class GenericPrintOfStudentInformation {
    static class student <N,A,S>{
        private N name;
        private A age;
        private S gander;
        public student(N name, A age, S gander){
            this.name = name;
            this.age = age;
            this.gander = gander;
        }
        public N getName() {
            return name;
        }
        public void setName(N name) {
            this.name = name;
        }
        public A getAge() {
            return age;
        }
        public void setAge(A age) {
            this.age = age;
        }
        public S getgander() {
            return gander;
        }
        public void setgander(S gander) {
            this.gander = gander;
        }
        @Override
        public String toString(){
            return "name: " + name + ", age: " + age + ", gander: " + gander;
        }
    }
    public static void main(String[] args) {
        var student001=new student<String,Integer,Character>("NingXiaoKuan", 35, 'm');
        //student student1 = new student("John", 35, 'm');
        System.out.println(student001.toString());
    }
}
