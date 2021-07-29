package model;

public class JavaKeyword {

	public static boolean containsJavaKeyword(String s) {
		
		String[] array={
				"abstract",	"assert","boolean",
				"break","byte","case",
				"catch","char","class","const",
				"continue","default",
				"do","double","else",
				"enum","extends","final",
				"finally","float","for",
				"goto","if","implements",
				"import","instanceof", "int",
				"interface","long","native",
				"new","package","private",
				"protected","public","return",
				"short","static","strictfp",
				"super","switch","synchronized",
				"this","throw","throws",
				"transient","try", "void",
				"volatile","while","var",
				"record","yield"};
		
		if(s==null) {
			return false;
		}
		
		for (int i = 0; i < array.length; i++) {
			if(s.toLowerCase().contains(array[i])) {
				return true;
			}
		}
		
		
		return false;
		
	}
	
}
