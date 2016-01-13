package sample.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
/**
 * Created by djshi on 2016/1/13.
 */
public class HelloGuiceModule implements Module {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.google.inject.Module#configure(com.google.inject.Binder)
	 */
	public void configure(Binder binder) {
		binder.bind(HelloGuice.class).to(HelloGuiceImpl.class);
	}
}
