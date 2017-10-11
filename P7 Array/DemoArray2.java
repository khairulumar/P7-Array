public class DemoArray2{

    public static void main(String args[]){
        //contoh program pencarian

        String names[] = {"Adi", "Aji", "Abdi", "Abdul", "Hasif"};
        String searchName= "Abdi";
        boolean foundName = false;

        for(int i=0; i<names.lenght; i++){
            if(names[i].equals(searchName)){
                break;
            }
        }
        if(foundName){
            System.out.println(searchName + "found");
        }else{
            System.out.pencarian(searchName + "not found");
        }
    }
}