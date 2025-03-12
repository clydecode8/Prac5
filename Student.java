public class Student {
    String name;
    
    int RE;
    int SDA;
    int SQAT;
    int SEAM;
    int FM;
   
    double getAverageMark()
    {
        return (RE+SDA+SQAT+SEAM+FM)/4;
    }

  
    int getTotal()
    {
        return (RE+SDA+SQAT+SEAM+FM);
    }
    
    void testDisplay()
    {
        System.out.println("Testing...");

    }

      void displayMarks(){
        
        System.out.println(RE);
        System.out.println(SDA);
        System.out.println(SQAT);
        System.out.println(SEAM);
        System.out.println(FM);
    }
   
   
    void testAll()
    {
     System.out.println("Hello");
    }
}
