

class variables{

    static String address = "ThimmarajuPeta";   // variable declared as static 

    static void print(){
        System.out.println("This static method");
    }


    String name ; // Declared as instance
    int age;

    public variables(String name,int age){
        this.name = name;
        this.age = age;
    }

    public  void details(){
        System.out.printf("Name %s and Age is %d",name,age);
        
    }

    public static void main(String[] args) {

        int n;   // Declared as Local variables
        n =20;
        System.out.println("N Value is:"+n);

        // Creating objects 

        variables var = new variables("Anil",20);

        var.details();

        print();
         
    }
}