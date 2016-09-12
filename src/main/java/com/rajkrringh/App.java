package com.rajkrringh;

import java.io.OutputStream;

/**
 * Hello world!
 *
 */
public class App
{
    private static final String name;
    private String name1;
    static{
        name="this name";
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.setName1("name1");
        app.printAll();

    }

    public void setName1(String name){
        this.name1=name;
    }

    public void printAll(){
        printStackTrace();

    System.out.println("sample name");
        if(name.equals("hello")){
            System.out.println("name is hello");
        }else{
            System.out.println("no name");
        }
        if(name1==null){
            System.out.println("name1 is null");
        }else {
            System.out.println("name1 is " + name1);
        }


}
    public void printStackTrace(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        OutputStream out=null;
        String exceptionMsg =null;
        try {
            for (StackTraceElement element : stackTraceElements) {
                exceptionMsg =
                        "Exception thrown from method " + element.getMethodName()
                                + " in class " + element.getClassName() + " [on line number "
                                + element.getLineNumber() + " of file " + element.getFileName() + "]";

                System.out.println(exceptionMsg);
            }
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
