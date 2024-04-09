public class Main {
    //필드 작성
    private String name;
    private int age;
    private static int totalPerson=0;

    public Main (String name,int age){
        this.name=name;
        this.age=age;
        totalPerson+=1; //정적 변수는 모든 인스턴스가 공유하므로 this.로 쓰지 않아도 된다.
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        name=newName;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public int getTotalPerson(){
        return totalPerson;
    }

    //toString 메서드
   @Override
    public String toString(){
        return  "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Main p1=new Main( "John", 25);
        Main p2=new Main( "Mary", 30);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println("TotalPerson: "+p2.getTotalPerson());
    }
}
