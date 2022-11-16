public class Main {
    public static void main(String[] args) {

      for(int i=2;i<=100;i++){
          if(i==2){
              System.out.print(i+",");
          }else if(i==3){
              System.out.print(i+",");
          }else if(i==5){
              System.out.print(i+",");
          }else if (i==7) {
              System.out.print(i+",");
          }else if(i%2==0 || i%3==0 || i%5==0 || i%7==0){
          }else{
              System.out.print(i+",");
          }
      }

    }
}