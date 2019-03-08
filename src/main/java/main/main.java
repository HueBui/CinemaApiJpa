package main;

import com.sun.net.httpserver.HttpServer;
import controller.ListAllActorController;
import controller.ListAllMovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class main {
    public static ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/listAllActor",new ListAllActorController());
        server.createContext("/listAllMovie",new ListAllMovieController());

        System.out.println("Start Port: " + server.getAddress());
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();

        System.out.println("<------------ Start: ---->");
    }
}
