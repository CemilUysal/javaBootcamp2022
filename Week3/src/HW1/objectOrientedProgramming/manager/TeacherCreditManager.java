package HW1.objectOrientedProgramming.manager;

public class TeacherCreditManager extends BaseCreditManager{
    @Override
    public  void Calculate() {
        System.out.println("Öğretmen kredisi Hesaplandı");
    }


    public void save(){
        System.out.println("Öğretmen kredi Eklendi");
    }
}
