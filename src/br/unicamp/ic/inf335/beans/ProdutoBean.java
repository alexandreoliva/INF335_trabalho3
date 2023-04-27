package br.unicamp.ic.inf335.beans;

public class ProdutoBean implements java.io.Serializable, Comparable<ProdutoBean>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String nome;
	private String descricao;
	private Double valor;
	private String estado;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public ProdutoBean () {
		codigo = new String();
		nome = new String();
	    descricao = new String();
		valor = 0.0;
		estado = new String();
	}
	
	
	public ProdutoBean(String codigo, String nome, String descricao, Double valor, String estado) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.estado = estado;
	}
	
	@Override
	public int compareTo(ProdutoBean p) {
		if (valor > p.getValor()) {
			return 1;
		} else if (valor < p.getValor()) {
			return -1;
		} else
		    return 0;
	}
	
	

}
