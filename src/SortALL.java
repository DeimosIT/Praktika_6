public class SortALL {
    public static Student[] str = new Student[5];
    public static void main(String[] args) {

        Student student0 = new Student(1026, "Alex");
        Student student1 = new Student(1125, "Ivan");
        Student student2 = new Student(1005, "Dima");
        Student student3 = new Student(1100, "Pol");
        Student student4 = new Student(1217, "Olesya");

        str[0] = student0;
        str[1] = student1;
        str[2] = student2;
        str[3] = student3;
        str[4] = student4;

        for(int i = 0; i < str.length; i++)
        {
            System.out.println(str[i].toString());
        }
        SortID(str);
        System.out.println("Result: \n");
        for(int i = 0; i < str.length; i++)
        {
            System.out.println(str[i].toString());
        }
    }
    public static void SortID(Student[] n){
        int reserv = 0;
        Student reserve;
        for(int j = n.length-1; j>0; j--) {
            for (int i = 0; i < j; i++) {
                if (n[i].id > n[i + 1].id) {
                    reserve = n[i];
                    n[i] = n[i+1];
                    n[i+1] = reserve;
                }
            }
        }
    }

}
