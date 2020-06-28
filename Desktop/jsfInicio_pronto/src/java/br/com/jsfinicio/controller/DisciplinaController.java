/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jsfinicio.controller;

import br.com.jsfinicio.model.AlunoModel;
import br.com.jsfinicio.model.DisciplinaModel;
import br.com.jsfinicio.repository.DisciplinaRepository;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author klaytonramires
 */
@ManagedBean
public class DisciplinaController {
    private DisciplinaModel disciplinaModel;
    private DisciplinaRepository disciplinaRepository;
    private List<DisciplinaModel> listaDeDisciplinas;

    public DisciplinaController(){
        this.disciplinaModel = new DisciplinaModel();
        this.disciplinaRepository = new DisciplinaRepository();
        this.listaDeDisciplinas =  new ArrayList<>();
    }
    
    public void salvar(){
        this.disciplinaRepository.salvar(this.disciplinaModel);
    }

    public void buscar(){
        this.listaDeDisciplinas = this.disciplinaRepository.buscarTodos();
    }
    public void excluir(){
        this.disciplinaRepository.excluirPorID(disciplinaModel.getIdDisciplina());
    }
    
    public DisciplinaModel getDisciplinaModel() {
        return disciplinaModel;
    }

    public void setDisciplinaModel(DisciplinaModel disciplinaModel) {
        this.disciplinaModel = disciplinaModel;
    }

    public DisciplinaRepository getDisciplinaRepository() {
        return disciplinaRepository;
    }

    public void setDisciplinaRepository(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    public List<DisciplinaModel> getListaDeDisciplina() {
        return listaDeDisciplinas;
    }

    public void setListaDeDisciplinas(List<DisciplinaModel> listaDeDisciplina) {
        this.listaDeDisciplinas= listaDeDisciplinas;
    }
    
}

