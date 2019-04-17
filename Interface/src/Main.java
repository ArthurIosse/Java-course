public class Main {
    public static void main(String[] args) {




    }

    public static void saveObject(Saveable objectToSave){
        for(int i = 0 ; i < objectToSave.write().size() ; i++){
            System.out.println("saving " +objectToSave.write().get(i)+ " to storage");
        }
    }

    public static void loadObject(Saveable objectToLoad){

    }
}
