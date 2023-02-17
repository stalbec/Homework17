public class Main {
    public static void main(String[] args) {
        Java employee1 = new Java("Matmusa",23,'M',"Matmusa@gmail.com");
        Java employee2 = new Java("Kamil",25,'M',"Kamil@gmail.com");
        Java employee3 = new Java("Nuriza",32,'F',"Nuriza@gmail.com");
        Java employee4 = new Java("Feruza",28,'F',"Feruza@gmail.com");
        Java employee5 = new Java("Sardar",19,'M',"Sardar@gmail.com");
        Java employee6 = new Java("Mirlan",20,'M',"Mirlan@gmail.com");
        Java employee7 = new Java("Alina",19,'F',"Alina@gmail.com");

        Java[] java1 = {employee1,employee2,employee3,employee4,employee5};
         Java[] java2 = {employee6,employee7};

        Android worker1 = new Android("Farukh",24,'M',"Farukh@gmail.com");
        Android worker2 = new Android("Almaz",26,'M',"Almaz@gmail.com");
        Android worker3 = new Android("Jyldyz",21,'F',"Jyldyz@gmail.com");
        Android worker4 = new Android("Datka",24,'F',"Datka@gmail.com");

        Android[] androids1 ={worker1,worker2,worker3};
        Android[] androids2 ={worker4};


        Go developer1 = new Go("Alik",35,'M',"Alik@gmail.com");
        Go developer2= new Go("Alik",35,'M',"Alik@gmail.com");
        Go developer3 = new Go("Argen",30,'M',"Argen@gmail.com");

        Go[] go1 = {developer1,developer2};
        Go[] go2 = {developer3};

        Company company1 = new Company("Toktonalieva 135", java1, androids1,go1,
                "Esen Niyazov");
        Company company2 = new Company("Gorky street,65",java2,androids2,go2,
                "Alex Savoisky");

        System.out.println(company1);
        System.out.println(company2);

    }
}