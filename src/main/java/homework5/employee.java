package homework5;

public class employee { //
    private String full_name;
    private String post;
    private String email;
    private int telephone;
    private int salary;
    private int age;

    public employee(String full_name,String post,String email,int telephone,int salary,int age){
        this.full_name = full_name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public void info() {
        System.out.printf("full_name: %s, post: %s, email: %s, telephone: %d, salary: %d, age: %d\n", this.full_name, this.post, this.email, this.telephone, this.salary, this.age);
    }
    public int getAge() {
        return this.age;
    }
}
