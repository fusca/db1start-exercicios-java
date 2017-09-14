package br.com.db1;

public class ExerciciosString {

	public String toUpperCase(String palavra){
		return palavra.toUpperCase();
	}
	
	public String toLowerCase(String palavra){
		return palavra.toLowerCase();
	}
	
	public Integer tamanhoPalavra(String palavra){
		return palavra.length();
	}
	
	public Integer tamanhoPalavraComEspaco(String palavra){
		return palavra.trim().length();
	}
	
	public String quatroPrimeirasLetrasNome(String nome){
		return nome.substring(0, 4);
	}
	
	public String aPartirTerceiraLetraNome(String nome){
		return nome.substring(3);
	}
	
	public String quatroUltimasLetrasNome(String nome){
		return nome.substring(nome.length() - 4);
	}
	
	public String susbtituiPrimeiroNome(String nome){
		Integer tamanhoPrimeiraPalavra = 0;
		for (Integer x = 0; x < nome.length(); x++) {
			if (nome.charAt(x) == ' ') {
				tamanhoPrimeiraPalavra = x;
				break;
			}
		}
		return "ALUNA" + nome.substring(tamanhoPrimeiraPalavra);
	}
	
	public String[] cortaTexto(String texto){
		return texto.split(",");
	}
	
	
	public Integer quantidadeVogais(String palavra){
		int cont = 0;
		
		for(int i=0; i<palavra.length();i++){
			switch(palavra.charAt(i)){	
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					++cont;
					break;
				default:
					break;
			}
		}
		return cont;
	}
	
	public String palavraInvertida(String palavra){
		String invertido = "";
		for(int i=palavra.length();i>0;i--){
			invertido += palavra.charAt(i-1);
		}
		return invertido;
	}
}
