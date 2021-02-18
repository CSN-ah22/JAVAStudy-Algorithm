package Practice;

public class pig implements Animal{
    @Override
    public void animalSound() {
        System.out.println("꿀꿀");
    }

    @Override
    public void sleep() {
        System.out.println("돼지 잔다");
    }
}
