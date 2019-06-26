package spring.io.Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ScopedProxyMode;


@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DataRequestScope {

	private String name = "Request Scope";
	
	public DataRequestScope() {
		System.out.println("DataRequestScope Constructor Called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}