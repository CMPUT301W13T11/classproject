package ca.ualberta.cmput301w13t11.FoodBank.model;

import org.apache.http.client.methods.HttpPost;

public class ServerClient {

	static private String test_server_string = "http://cmput301.softwareprocess.es:8080/testing/cmput301w13t11/";

	static private HttpPost httpPost = new HttpPost(test_server_string);

}
