// upcast and down cast

class Staff{
    public void displayRole(){
        System.out.println("This is staff class");
    }
}

class Professor extends Staff{
    @Override
    public void displayRole(){
        System.out.println("This is professor class");
    }

    public void teach(){
        System.out.println("Professor is teaching");
    }
}

class AdminStaff extends Staff{
    @Override
    public void displayRole(){
        System.out.println("This is admin staff class");
    }

    public void manageRecords(){
        System.out.println("Admin staff is managing records");
    }
}

public class Main {
    public static void main(String args[]){

        // upcasting
        Staff p = new Professor();
        Staff a = new AdminStaff();

        p.displayRole();
        a.displayRole();

        // downcasting
        try {
            if(p instanceof Professor){
                Professor p1 = (Professor)p;
                p1.teach();
                p1.displayRole();
            }

            if(a instanceof AdminStaff){
                AdminStaff a1 = (AdminStaff)a;
                a1.manageRecords();
                a1.displayRole();
            }

            Professor p2 = (Professor)a;
           
          
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: "+ e.getMessage());
        }finally{
            System.out.println("Finally block is executed");
        }
    }    
}
