import java.io.*;
import java.util.*;


public class lab10{
    public static void main(String args[]) throws Exception{
            BufferedReader in = new BufferedReader(new FileReader("out.txt"));
                List<Element> lista = new ArrayList<Element>();
                String s;
                while( (s = in.readLine()) != null ){
                    String[] elem;
                    elem = s.split(" ");
                    Element element = new Element(elem[0], elem[1]);
                    lista.add(element);
            }
            if(args.length == 3 && args[0].equals("add")){
                Element nowy = new Element(args[1],args[2]);
                
                lista.add(nowy);
                
            }

            if(args.length == 2 && args[0].equals("del")){
                
                for(int idx =0; idx<lista.size(); ++idx){
                    if(lista.get(idx).getStr1().equals(args[1]) || lista.get(idx).getStr2().equals(args[1])){
                        lista.remove(idx);
                    }
                    
                }
            }

            if(args.length == 1){
                
            for(Element x : lista){
                if(args[0].equals(x.getStr1())){
                    System.out.println(x.getStr2());
                    break;
                } 
                if(args[0].equals(x.getStr2())){
                    System.out.println(x.getStr1());
                    break;
                }
                else{
                    System.out.println("nie ma slowa w slowniku");
                    break;
                }
            }

            }
            FileWriter fw = new FileWriter("out.txt");
            for(Element x : lista){
                fw.write(x.getStr1()+" "+x.getStr2()+"\n");
            }
            fw.close();
        }
}