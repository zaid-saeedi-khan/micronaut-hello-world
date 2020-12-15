package gateway;

import gateway.httpclient.HelloClient;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

	private HelloClient helloClient;

	public HelloController(HelloClient helloClient) {
		this.helloClient = helloClient;
	}

	@Get(value = "/message", produces = MediaType.TEXT_PLAIN)
	public String index() {
		return helloClient.retrieveMessage();
	}

}