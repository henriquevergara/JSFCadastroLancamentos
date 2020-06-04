package com.henrique.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.henrique.model.Lancamento;

@ManagedBean
@SessionScoped
public class ViewLancamentoBean implements Serializable{


	private static final long serialVersionUID = 1L;
	
	
	private List<Lancamento> lancamentos;
	private Lancamento lancamento;
	
	public List<Lancamento> getLancamentos() {
		return lancamentos;
	}
	
	public void setLancamentos(List<Lancamento> lancamentos) {
		this.lancamentos = lancamentos;
	}
	
	public Lancamento getLancamento() {
		return lancamento;
	}
	
	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}
	
	public ViewLancamentoBean(){
		
		lancamentos = new ArrayList<>();
		lancamento = new Lancamento();
		
	}
	
	

	
}
