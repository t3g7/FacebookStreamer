package main;
import static spark.Spark.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setPort(80);
		get("/hello", (req, res) -> "Hello World");
		post("/hello", (req, res) -> "Hello World");
		awaitInitialization();
	}

}
