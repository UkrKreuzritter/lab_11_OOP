package ucu.edu.ua.task1;



public class Main {
    public static void main(String[] args) 
    {
        User user = User.builder()
                        .name("Mykola Parasuk")
                        .age(45)
                        .gender("MALE")
                        .weight(100)
                        .height(210)
                        .build();
        System.out.println(user);
    }
}