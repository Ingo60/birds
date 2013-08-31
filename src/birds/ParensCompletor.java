/**
 * complete input by inserting ')'
 */
package birds;

import java.util.List;

import jline.Completor;

/**
 * @author ingo
 *
 */
public class ParensCompletor implements Completor {

	/**
	 * make it
	 */
	public ParensCompletor() {
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public int complete(String buffer, int cursor, List result) {
		// System.err.println("()-completor: `" + buffer + "` " + cursor);
		int n = 0, i = 0;
		for (i = 0; i < cursor && i < buffer.length(); i++) {
			final char c = buffer.charAt(i);
			if (c == ')') n--;
			if (c == '(') n++;
		}
		String compl = "";
		while (n > 0) { compl += ")"; n--; }
		if (compl.length() > 0) result.add(compl);
		return i == cursor ? cursor : buffer.length();
	}

}
