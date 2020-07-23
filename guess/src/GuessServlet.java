import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

@WebServlet(name = "GuessServlet")
public class GuessServlet extends javax.servlet.http.HttpServlet {
    void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        Random rand = new Random();
        int guessnum = rand.nextInt(100);
        int times = 0;
        Scanner input = new Scanner(System.in);
        int guess;

        System.out.println("hellow"+name+"Guess a number between 1 and 100");
        guess=input.nextInt();
        times++;
        if (guess == guessnum){
            System.out.println("That's right! You guessed my number in only" + times +"times! Would you like to play again?");
        }
        else if(guess < guessnum){
            System.out.println("No! That's too low. Guess again.");
        }
        else if(guess > guessnum){
            System.out.println("No! That's too high. Guess again.");
        }
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest(request, response);
    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        processRequest(request,response);
    }
}
