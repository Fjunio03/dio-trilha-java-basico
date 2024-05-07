public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        //modo recomendado de se usar o Swicth
        switch (plano) {
            case "T":
                System.out.println("5GB Youtube");
            case "M":
                System.out.println("WhatsApp e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");  
        }
    }
}
/*Caso dse usar o if else, o código ficará maior
Ex:

public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
			
		
	}
}
 * 
 */
