/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WrenchDb.Core.Helpers;

import java.util.Date;



/**
 *
 * @author d.fontani
 */
public class JSONHelper {
    
    
    public static String encodeString(String s)
    {
        
       return s.replace("\"", "\\\"")
          .replace("\\", "\\\\")
         .replace("\n", "\\n")
          .replace("\r", "\\r")
          .replace("\t", "\\t")
               // .replace("'", "\\'") 
                .replace("\b", "\\b");
    }
    public static String ConvertBaseType(Object Value)
    {
        if(Value==null) return "null";
       String cname= Value.getClass().getName();
       String literalValue="";
       
       // System.err.println("sdsd"+cname+" "+Value.toString());
       switch(cname)
       {
            case "java.lang.String": literalValue="\""+encodeString(Value.toString()) +"\""; 
            break;
            case "java.lang.Double": literalValue=Value.toString() ;
            break;
            case "java.lang.Float": literalValue=Value.toString() ;
            break;
            case "java.lang.Integer": literalValue=Value.toString() ;
            break;
            case "java.lang.BigInteger": literalValue=Value.toString() ;
            break;
            case "java.lang.Long": literalValue=Value.toString() ;
             break;
            case "java.lang.Boolean": literalValue=Value.toString() ;
            break;
            case "java.util.Date": 
                literalValue="\"Date("+((Date)Value).getTime()+"-0000)\"";
                break;
            
           default:
               literalValue="\""+encodeString(Value.toString())+"\"";
       }
       return literalValue;
    }
}
