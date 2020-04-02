package Refelect;

import java.io.*;

public class MyClassLoad  extends ClassLoader{
    /*自定义类加载器

    // 还记得类加载器是做什么的么？
    // "从外部系统中，加载一个类的定义（即Class对象）"
    // 请实现一个自定义的类加载器，将当前目录中的字节码文件加载成为Class对象
    // 提示，一般来说，要实现自定义的类加载器，你需要覆盖以下方法，完成：
    //
    // 1.如果类名对应的字节码文件存在，则将它读取成为字节数组
    //   1.1 调用ClassLoader.defineClass()方法将字节数组转化为Class对象
    // 2.如果类名对应的字节码文件不存在，则抛出ClassNotFoundExcep

    * */
    private final File path;//存放字节码文件的目录

    public MyClassLoad(File path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = getByte(name);
        if(data==null){
            throw  new ClassNotFoundException();
        }
        return  defineClass(name,data,0,data.length);
    }

     byte[] getByte(String name) throws  ClassNotFoundException {
         ByteArrayOutputStream os = new ByteArrayOutputStream();
         File file = new File(path,name+".class");
         int len =0;
         try {
             FileInputStream fileInputStream = new FileInputStream(file);
             byte[] bytes = new byte[1024];
             while ((len=fileInputStream.read(bytes))!=-1){
                 os.write(bytes,0,len);
             }
         } catch (FileNotFoundException e) {
             throw new ClassNotFoundException();
         } catch (IOException e) {
             e.printStackTrace();
         }
        return os.toByteArray();
     }
}
