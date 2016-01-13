package sample.guice;

/**
 * Created by djshi on 2016/1/13.
 */
public class HelloGuiceImpl implements HelloGuice {

	/* (non-Javadoc)
	 * @see cn.jcourse.guice.HelloGuice#sayHello()
	 */
	public void sayHello() {
		System.out.println("Hello Guice!");
	}
}
