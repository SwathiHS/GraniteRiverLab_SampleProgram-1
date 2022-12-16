import java.util.*;
    
class project {
        public float dist[] = new float[10];
        public float time[] = new float[10];
        public float speed[] = new float[10];
    
    class Dataset {
        float distance;
        float time;
    }
    
    void func(){
    
    class UserInput {
        Scanner sc = new Scanner(System.in);
        void method1(){
            for(int i=0;i<10;i++){
                System.out.print("Distance: ");
                dist[i] = sc.nextFloat();
                System.out.print("Time: ");
                time[i] = sc.nextFloat();
            }  
        }
    }
    class Measure extends UserInput {
        void func(){
            for(int i=0;i<10;i++){
                speed[i] = dist[i]/time[i];
            }
        }
    }
    
    
    class ShowResults extends UserInput{
        void method1(){
            for(int i=1;i<11;i++){
                System.out.println(""+i+" details are "+"Distance: "+dist[i-1]+" Time: "+time[i-1]+" Speed: "+speed[i-1]);
            }
        }
    }
    UserInput obj1 = new UserInput();
    obj1.method1();
    Measure obj2 = new Measure();
    obj2.func();
    ShowResults obj3 = new ShowResults();
    obj3.method1();
    }
}
public class Main {
    
    
    public static void main(String[] args){
        project obj = new project();
        obj.func();
    }
}
