class w_c{
	private String metinString;
	public w_c(String metin){
		metinString = metin;
		count();
	}
	private void count() {
		int word_count= metinString.split(" ").length;
		int letter_count = 0;
		int letter_count2 = 0;
			for (String str : metinString.split(" ")) {
				System.out.println(str.length());
				for (int j = 0; j < str.length(); j++) {
						letter_count++;
				}
			}	
		System.out.println("word count1:"+word_count);		
		System.out.println("letter count1:"+letter_count);
		System.out.println("letter count2:"+letter_count2);
	}
}

public class word_count {
	public static void main(String[] args) {
		String tString = "hello world today is a new day";
		w_c ilkC = new w_c(tString);
	}
}
