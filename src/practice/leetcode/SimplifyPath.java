package practice.leetcode;

class SimplifyPath {

	public static void main(String[] args) {
		String str = "/a/./b/../../c/";//-> /c      /a/./b/../../c/
		System.out.println(simplifyPath(str));
	}

	private static String simplifyPath(String path) {
		while(path.indexOf("..") != -1) {
			int index = path.indexOf("..") - 1;
			int i = index-1; 
			while(path.charAt(i) != '/') {
				i--;
			}
			path = path.substring(0,index+1)+path.substring(index+3, path.length());
			path = path.replaceFirst(path.substring(i, index), "");
		}
		path = path.replace("//", "/");
		if (path.endsWith("/")) {
			path = path.substring(0, path.length() - 1);
		}
		if (!path.startsWith("/")) {
			path = "/" + path;
		}
		return path;
	}

}
