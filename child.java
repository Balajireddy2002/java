//Example for dynamic method dispatching
class parent{
    public void show(){
        System.out.println("i am parent class");
    }
}
class child extends parent{
     public void show(){
        System.out.println("i am child class");
    }
    public static void main(String args[]){
        parent p=new parent();
        p.show();
        p=new child();
        p.show();
    }
}
