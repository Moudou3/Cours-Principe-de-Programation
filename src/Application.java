import javax.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        System.out.println("Début de déploiement de mon service");
        String url ="http://localhost:8888/"; // adresse qu'on va utilisé pour publier le service /on ajoute ?wsdl dan sle navigateur
        Endpoint.publish(url, new MonserviceWeb()); // pour publier il prend l'url et l'instance du service qu'on veut publier
        System.out.println("Le service Web est déployé");
    }
}
