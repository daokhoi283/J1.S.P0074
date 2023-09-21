public class Main {
    public static void Menu(){
        System.out.println("=====Caculator program=====");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quite"); 
    }
    public static void main(String[] args) throws Exception { 
        Matrix m = new Matrix();
        while (true) {
            Menu();
            int choice = m.inputIntChoice(1, 4);
            switch (choice) {
                case 1:
                    m.addMatrix();
                    break;
                case 2:
                    m.SubMatrix();
                    break;
                case 3:
                    m.MultiMatrix();
                    break;
                case 4:
                    return; 
            }
        }
    }
}
