import java.io.*;
import java.util.*;

import io.*;
import io.MyData;

/** Demonstrate use of Serialization. Typical Subclass main will be:
 *	public static void main(String[] s) throws Exception {
 *		new SerialDemoXXX().save();		// in parent class; calls write
 *		new SerialDemoXXX().dump();
 *	}
 */
public abstract class SerialDemoAbstractBase {

	/** The save method in an application */
	public void save() throws IOException {
		List l = new ArrayList();
		// Gather the data
		l.add(new Date());
		l.add(new MyData("Ian Darwin", "secret_java_cook"));
		l.add(new MyData("Abby Brant", "dujordian"));
		write(l);
	}

	/** Does the actual serialization */
	public abstract void write(Object theGraph) throws IOException;

	/** Reads the file and displays it. */
	public abstract void dump() throws IOException, ClassNotFoundException;
}