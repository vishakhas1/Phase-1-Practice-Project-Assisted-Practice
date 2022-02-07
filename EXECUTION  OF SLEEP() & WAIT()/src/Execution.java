class Exeution{
   
private static Object KEY = new Object();
 
public static void main(String[] args)
  throws InterruptedException {
  
    Thread.sleep(2000);
   
    System.out.println("Thread '" + Thread.currentThread().getName() +
      "' is woken after sleeping for 2 second");
  
    synchronized (KEY)
    {
        KEY.wait(2000);
       
        System.out.println("Object '" + KEY + "' is woken after" +
          " waiting for 2 second");
    }
}
}
