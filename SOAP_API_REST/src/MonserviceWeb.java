// SOAP :Simple Object Access Protocol
// JAX-WS (Java Annotation XML for web service)
//JAXB (Java Architecture XML Building) il permet la sérialisation (transformer un objet java en xml) et la déserialisation (fichier ou document xml en objet java)

// URL : Uniforme Resource Locator
// URN : Uniforme Resource name
// URI : Uniforme Resource Identifier
// URN + URL = URI

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.sorbonne.fr")
public class MonserviceWeb {

    @WebMethod(operationName = "convertir")
    public double conversion(double mt){
        return mt*0.9;
    }

    public double somme(@WebParam(name = "parametre1") double a, double b){
        return a+b;
    }

    public Etudiant getEtudiant(int identifiant){
        return new Etudiant(1, "Mamoudou",19.0);

    }
}
