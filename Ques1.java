import java.util.Scanner;

	public class Ques1 {
		private String[] names=new String[50];
		final int num_names=3;
		
		public void get_string(Ques1 qe)
		{
			Scanner input = new Scanner(System.in);
			int i;
			for(i=0;i<num_names;i++) {
				qe.names[i]=input.next();
			}
			
		}
		public void print_string(Ques1 qe)
		{
			int i;
			for(i=0;i<num_names;i++) {
				System.out.println(names[i]);
			}
		}
		public int string_start_with_A(Ques1 qe) {
			int i,j=0;
			for(i=0;i<num_names;i++) {
				if(qe.names[i].charAt(0)=='A')
					j++;
			}
			return j;
		}
		public int string_end_with_num(Ques1 qe) {
			int i,j=0;
			for(i=0;i<num_names;i++) {
				if(qe.names[i].charAt(qe.names[i].length()-1)>='0'&&qe.names[i].charAt(qe.names[i].length()-1)<='9')
					j++;
			}
			return j;
		}
	}
