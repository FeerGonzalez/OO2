package main;

import eje4.RestCall;

public class MainEje4 {

	public static void main(String[] args) {
		RestCall rest = new RestCall("https://jsonplaceholder.typicode.com/posts");
		System.out.println(rest.run());

	}

}
