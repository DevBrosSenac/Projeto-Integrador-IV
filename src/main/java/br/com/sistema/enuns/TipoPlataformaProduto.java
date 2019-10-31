package br.com.sistema.enuns;

public enum TipoPlataformaProduto {

	NaoDefinido("Não Definido"),

	SWITCH("Nintendo Switch"),
	
	PS4("PlayStation 4"),
	
	XBOXONE("XBOX ONE"),
	
	PS3("PlayStation 3"),
	
	XBOX360("XBOX 360");

	private String descricao;

	private TipoPlataformaProduto(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
