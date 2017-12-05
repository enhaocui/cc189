package cc189;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class PStoLog {
	/*
	 * Pure storage OA 2nd coding problem
	 * @param: input a list of logs ACTION EVENT
	 * check if this log is valid
	 * */
	public int checkLog(String[] logs) {
		Stack<String> s = new Stack<>();
		Set<String> hs = new HashSet<>();
		int step = 0;
		if (logs == null)	return 0;
		for (String str: logs) {
			String[] strs = str.split(" ");
			if (strs[0].equals("ACQUIRE")) {
				if (hs.contains(strs[1]))	return step;
				s.push(strs[1]);
				hs.add(strs[1]);
			}
			else {
				if (s.isEmpty() || !s.peek().equals(strs[1]))	return step;
				s.pop();
				hs.remove(strs[1]);
			}
			step ++;
		}
		if (!s.isEmpty())	return step;
		return 0;
	}
}
