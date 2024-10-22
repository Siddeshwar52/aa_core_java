package aa_iterations;

public class Demo {

	public static void main(String[] args) {
		
	     String QUERY_BY_REFERENCE = String.join(System.lineSeparator(),
	             "select  *",
	             "from    v_mod_requests",
	             "where   user_email   =   ?",
	             "and     request_date between ? and ? + 1");
	     
	     System.out.println(QUERY_BY_REFERENCE);
		

	}

}
