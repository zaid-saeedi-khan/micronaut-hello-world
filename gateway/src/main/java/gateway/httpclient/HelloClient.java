package gateway.httpclient;

import io.micronaut.context.annotation.Requires;
import io.micronaut.context.env.Environment;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("helloworld")
@Requires(notEnv = Environment.TEST)
public interface HelloClient {

	@Get(value = "/hello", consumes = MediaType.TEXT_PLAIN)
	String retrieveMessage();

}