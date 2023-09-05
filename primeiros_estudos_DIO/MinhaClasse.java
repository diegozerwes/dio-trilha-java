package primeiros_estudos_DIO;

public class MinhaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String primeiroNome = "Diego";
		String segundoNome = "Henrique";
		
		String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
		
		

	}
			public static String nomeCompleto (String primeiroNome, String segundoNome) {
				return primeiroNome.concat(" ").concat(segundoNome);
		}
}
