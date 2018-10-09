package aula0310;

public enum EPartidoPolitico {

	PDC("Partido da Comida", 6),
	PMMORPG("Partido dos MMORPGs", 2),
	PFPS("Partido dos FPSs", 42);
	
	private String descricao;
	private int numeroEleitoral;
	
	private EPartidoPolitico(String descricao, int numeroEleitoral) {
		this.descricao = descricao;
		this.numeroEleitoral = numeroEleitoral;
	}
	
	public EPartidoPolitico getPorDescricao(String descricao) {
		EPartidoPolitico retorno = null;
		if (PDC.descricao.equals(descricao)) {
			retorno =  PDC;
		} else if (PMMORPG.descricao.equals(descricao)) {
			retorno =  PMMORPG;
		} else if (PFPS.descricao.equals(descricao)) {
			retorno =  PFPS;
		} 
		return retorno;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getNumeroEleitoral() {
		return numeroEleitoral;
	}
	
}
